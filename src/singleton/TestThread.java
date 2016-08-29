package singleton;

// 测试线程：用于各种单例实现中的多线程安全性测试
public class TestThread extends Thread {
	private Object singletonObject;
	
	public TestThread(Object singleton) {
		this.singletonObject = singleton;
	}
	
	@Override
	public void run() {
		System.out.println(singletonObject.hashCode());
	}
}