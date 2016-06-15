package simpleFactory.c;

public class OperationFactory {

	public static Operation createOperation(String op) {
		Operation ret = null;
		
		if (op.equals("+"))
			ret = new OperationAdd();
		else if (op.equals("-"))
			ret = new OperationSub();
		else if (op.equals("*"))
			ret = new OperationMul();
		else if (op.equals("/"))
			ret = new OperationDiv();

		return ret;

	}
}