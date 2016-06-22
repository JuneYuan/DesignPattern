package proxy.d;

//Subject类，定义了RealSubject和Proxy的共用接口,
//这样就可以在任何使用RealSubject的地方都使用Proxy
public interface Subject {
	public void request();
}
