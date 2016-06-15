package simpleFactory.c;

public class OperationDiv extends Operation {

	public double getResult() {
		double ret = 0;
		try {
			ret = getNumA() / getNumB();			
		} catch (ArithmeticException e) {
			System.out.println("输入有误：" + e.getMessage());
			e.printStackTrace();
		} finally {
			return ret;
		}
	}
}
