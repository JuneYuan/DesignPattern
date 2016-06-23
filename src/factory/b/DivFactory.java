package factory.b;

import simpleFactory.c.Operation;
import simpleFactory.c.OperationDiv;

public class DivFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationDiv();
	}
}
