package singleton;

// 饿汉法：在单例类被加载时候，就实例化一个对象（而不管实际是否需要）
public class HungerSingleton {
	private static HungerSingleton singleton = new HungerSingleton();
	
	private HungerSingleton(){}
	
	public static HungerSingleton getInstance() {
		return singleton;
	}
}
