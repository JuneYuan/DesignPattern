package factory.b;

import simpleFactory.c.Operation;
import simpleFactory.c.OperationSub;

public class SubFactory implements IFactory {

	@Override
	public Operation createOperation() {
		return new OperationSub();
	}

}
