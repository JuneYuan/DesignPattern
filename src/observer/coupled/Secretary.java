package observer.coupled;

import java.util.ArrayList;
import java.util.List;

public class Secretary {
	// 同事列表
	private List<StockObserver> observers = new ArrayList<>();
	private String action;
	
	// 增加
	public void attach(StockObserver observer) {
		observers.add(observer);
	}
	
	// 通知
	public void announce() {
		for (StockObserver obs : observers)
			obs.update();
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
}
