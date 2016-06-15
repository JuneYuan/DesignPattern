package simpleFactory.c;

public class OperationAdd extends Operation {
	
	public double getResult() {
		double ret = getNumA() + getNumB();
		return ret;				
	}
}
