package singleton;

// 静态内部类方式：由JVM本身的机制保证了线程安全、延迟加载，没有性能方面的缺陷

// TODO 遇到序列化对象会失败？

public class StaticInnerClassSingleton {
	private static class Handler {
		private static StaticInnerClassSingleton myObject = new StaticInnerClassSingleton();
	}
	
	private StaticInnerClassSingleton() {}
	
	public static StaticInnerClassSingleton getInstance() {
		return Handler.myObject;
	}
	
	// 测试
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
