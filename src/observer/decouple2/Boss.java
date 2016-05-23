package observer.decouple2;

import java.util.ArrayList;
import java.util.List;

//具体的通知者类可能是前台，也可能是老板，它们也许有各自的一些方法，但对于通知者来说，它们是一样的，所以它们都去实现这个接口。  
public class Boss implements Subject {
	private List<Observer> observers = new ArrayList<>();
	private String action;
	
	// 增加
	public void attach(Observer observer) {
		observers.add(observer);
	}
	
	public void detach(Observer observer) {
		observers.remove(observer);
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
