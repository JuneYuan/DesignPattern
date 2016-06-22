package proxy.d;

public class RealSubject implements Subject {

	@Override
	public void request() {
		System.out.println("真实的请求");
	}
	
}
