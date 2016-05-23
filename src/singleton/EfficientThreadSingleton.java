package singleton;

// 兼顾线程安全和效率的写法（双重检查锁）
public class EfficientThreadSingleton {
	private static volatile EfficientThreadSingleton singleton; // 保证对所有线程的可见性

	private EfficientThreadSingleton() {
	}

	public static EfficientThreadSingleton getInstance() {
		// 在加锁前多进行一次null检查，减少了绝大多数的加锁操作，提高执行效率
		if (singleton == null) {
			synchronized (EfficientThreadSingleton.class) {
				if (singleton == null)
					singleton = new EfficientThreadSingleton();
			}
		}
		return singleton;
	}
}
