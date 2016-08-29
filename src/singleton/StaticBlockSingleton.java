package singleton;

// 使用static代码块：静态代码块只能被执行一次
public class StaticBlockSingleton {
	private static StaticBlockSingleton myObject = null;
	
	private StaticBlockSingleton() {}
	
	static {
		myObject = new StaticBlockSingleton();
	}
	
	public static StaticBlockSingleton getInstance() {
		return myObject;
	}

	public static void main(String[] args) {
		TestThread[] threads = new TestThread[10];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new TestThread(StaticInnerClassSingleton.getInstance());
		}
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}
	}

}
