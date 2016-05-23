package observer.decouple2;

//通知者接口  
public interface Subject {
	void attach(Observer observer);
	
	void detach(Observer observer);
	
	void announce();
	
	String getAction();
	
	void setAction(String action);
}
