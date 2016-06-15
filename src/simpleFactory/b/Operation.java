package simpleFactory.b;

public class Operation {
	
	public static double getResult(String numA, String numB, String op) {
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

}
