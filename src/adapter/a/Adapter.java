package adapter.a;


// Adapter类，通过在内部包装一个Adaptee对象，把源接口转换成目标接口 
public class Adapter extends Target {
	private Adaptee adaptee = new Adaptee();
	
	// 源接口：specificRequest()
	// 目的接口：request()
	public void request() {
		adaptee.specificRequest();
	}
}
