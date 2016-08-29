package singleton;

// 延迟加载 == 懒汉模式
public class LazySingleton {
	private volatile static LazySingleton myObject;
	
	private LazySingleton() {}
	
	// 1. 设置同步方法：整个方法上锁，效率太低
	// 2. 同步重要代码块（创建对象语句）：仍然存在线程安全问题（多个线程都检测到对象为null，同步后依然创建多次）
	// 3. DCL双检查锁：可能出现因“myObject = new LazySingleton()”指令重排序而导致的初始化不完全问题
	// 4. 双检查加volatile
	public static LazySingleton getInstance() {
		if (myObject == null) {
			synchronized (myObject) {
				if (myObject == null) {
					myObject = new LazySingleton();
				}
			}
		}
		return myObject;
	}
	
	// 测试
	public static void main(String[] args) {
		TestThread t1 = new TestThread(LazySingleton.getInstance());
		TestThread t2 = new TestThread(LazySingleton.getInstance());
		TestThread t3 = new TestThread(LazySingleton.getInstance());
		t1.start();
		t2.start();
		t3.start();
	}
}
