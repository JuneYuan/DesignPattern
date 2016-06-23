package factory.a;

import simpleFactory.c.Operation;
import simpleFactory.c.OperationFactory;

public class Main {

	public static void main(String[] args) {
		Operation oper = OperationFactory.createOperation("+");
		oper.setNumA("12");
		oper.setNumB("16");
	}

}
