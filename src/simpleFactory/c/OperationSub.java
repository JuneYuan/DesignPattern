package simpleFactory.c;

public class OperationSub extends Operation {
	
	public double getResult() {
		double ret = getNumA() - getNumB();
		return ret;				
	}
}
