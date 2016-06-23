package factory.b;

import simpleFactory.c.Operation;
import simpleFactory.c.OperationMul;

public class MulFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationMul();
	}
}
