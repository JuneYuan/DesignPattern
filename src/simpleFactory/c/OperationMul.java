package simpleFactory.c;

public class OperationMul extends Operation {
	
	public double getResult() {
		double ret = getNumA() * getNumB();
		return ret;				
	}
}
