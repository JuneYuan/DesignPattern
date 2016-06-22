package proxy.d;

public class Proxy implements Subject {
	RealSubject realSubject;

	@Override
	public void request() {
		if (null == realSubject)
			realSubject = new RealSubject();
		realSubject.request();
	}
	
}
