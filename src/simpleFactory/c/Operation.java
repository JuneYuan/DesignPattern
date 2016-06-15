package simpleFactory.c;

public abstract class Operation {
	private double numA = 0;
	private double numB = 0;
	
	abstract public double getResult() throws RuntimeException;
	
	public double getNumA() {
		return numA;
	}
	
	public double getNumB() {
		return numB;
	}
	
	public void setNumA(String numA) {
		this.numA = Double.parseDouble(numA);
	}
	
	public void setNumB(String numB) {
		this.numB = Double.parseDouble(numB);
	}
	
}
