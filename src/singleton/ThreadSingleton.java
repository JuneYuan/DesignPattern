package singleton;

// 线程安全的写法
public class ThreadSingleton {
	private static volatile ThreadSingleton singleton;  // 保证对所有线程的可见性
	
	private ThreadSingleton() {}
	
	public static ThreadSingleton getInstance() {
		// 对null的判断以及new操作加锁
		synchronized(ThreadSingleton.class) {
			if (singleton == null)
				singleton = new ThreadSingleton();
			return singleton;
		}
	}
}
