package simpleFactory.a;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
	
	private static double getResult(String numA, String numB, String op) {
		double ret = 0;
		try {	
			if (op.equals("+"))
				ret = Double.parseDouble(numA) + Double.parseDouble(numB);
			else if (op.equals("-"))
				ret = Double.parseDouble(numA) - Double.parseDouble(numB);
			else if (op.equals("*"))
				ret = Double.parseDouble(numA) * Double.parseDouble(numB);
			else if (op.equals("/")) {
				ret = Integer.parseInt(numA) / Integer.parseInt(numB);
			}
		} catch (NumberFormatException e) {
			System.out.println("输入有误：" + e.getMessage());
			e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println("输入有误：" + e.getMessage());
			e.printStackTrace();			
		}
		return ret;
	}
	
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
			
			String ret = String.valueOf(getResult(numA, numB, op));
			System.out.println("结果是：" + ret);
			


		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
