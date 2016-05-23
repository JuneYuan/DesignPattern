package singleton;

// 静态内部类法（可以延迟加载，又能保证线程安全）
public class StaticInnerSingleton {
	private static class Holder {
		private static StaticInnerSingleton singleton = new StaticInnerSingleton();
	}
	
	private StaticInnerSingleton() {}
	
	public static StaticInnerSingleton getInsatnce() {
		return Holder.singleton;
	}
}
