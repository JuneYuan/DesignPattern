package observer.decouple2;

//对于具体的观察者，需要更改的地方就是把与‘前台’耦合的地方都改成针对抽象的通知者  
public class StockObserver extends Observer {
	
	public StockObserver(String name, Subject sub) {
		super(name, sub);
	}
	
	public void update() {
		System.out.println(sub.getAction() + " " + name + "关闭股票行情，继续工作！");		
	}
}
