package factory.b;

import simpleFactory.c.Operation;

public class Main {
	public static void main(String[] args) {
		IFactory openFactory = new AddFactory();
		Operation oper = openFactory.createOperation();
		
		oper.setNumA("1");
		oper.setNumB("2");
		
		double result = oper.getResult();
		System.out.println("结果是：" + result);
	}
}
