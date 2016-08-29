package singleton;

// 立即加载方式 == 饿汉模式
// 缺点：不能依赖参数或配置文件创建对象
public class HungrySingleton {
	private static HungrySingleton myObject = new HungrySingleton();
	
	private HungrySingleton() {}
	
	public static HungrySingleton getInstance() {
		return myObject;
	}

	// 测试
	public static void main(String[] args) {
		TestThread t1 = new TestThread(HungrySingleton.getInstance());
		TestThread t2 = new TestThread(HungrySingleton.getInstance());
		TestThread t3 = new TestThread(HungrySingleton.getInstance());
		t1.start();
		t2.start();
		t3.start();
	}

}
