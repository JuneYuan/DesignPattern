package simpleFactory.c;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
		
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		BufferedReader bufferReader = new BufferedReader(in);
	
		try {
			System.out.println("请输入数字A：");
			String numA = bufferReader.readLine();
			System.out.println("请选择运算符（＋、－、＊、／）：");
			String op = bufferReader.readLine();
			System.out.println("请输入数字B：");
			String numB = bufferReader.readLine();
			
			Operation operation = OperationFactory.createOperation(op);
			operation.setNumA(numA);
			operation.setNumB(numB);
			System.out.println("结果是：" + operation.getResult());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
