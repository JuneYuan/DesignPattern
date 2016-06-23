package factory.b;

import simpleFactory.c.Operation;
import simpleFactory.c.OperationAdd;

public class AddFactory implements IFactory {
	
	@Override
	public Operation createOperation() {
		return new OperationAdd();
	}
}
