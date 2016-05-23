package singleton;

// 懒汉式、单线程
public class LazySingleton {
	private static LazySingleton singleton;
	
	private LazySingleton() {}
	
	public static LazySingleton getInstance() {
		if (singleton == null)
			singleton = new LazySingleton();
		return singleton;
	}
}
