package observer.decouple1;

public class StockObserver extends Observer {
	
	public StockObserver(String name, Secretary sub) {
		super(name, sub);
	}
	
	public void update() {
		System.out.println(sub.getAction() + " " + name + "关闭股票行情，继续工作！");		
	}
}
