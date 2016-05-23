package observer.decouple1;

public class NBAObserver extends Observer {
	
	public NBAObserver(String name, Secretary sub) {
		super(name, sub);
	}
	
	public void update() {
		System.out.println(sub.getAction() + " " + name + "关闭NBA直播，继续工作！");		
	}
}
