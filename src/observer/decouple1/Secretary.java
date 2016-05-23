package observer.decouple1;

import java.util.ArrayList;
import java.util.List;

public class Secretary {
	// 同事列表
	private List<Observer> observers = new ArrayList<>();
	private String action;
	
	// 增加
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	// 通知
	public void announce() {
		for (Observer obs : observers)
			obs.update();
	}
	
	public String getAction() {
		return action;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
}
