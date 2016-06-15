package strategy.c;

public class Main {
	private static double total = 0;
	
	private static void consume(String type, int num, int price) {
		CashSuper csuper = CashFactory.createCash(type);
		double itemPrice = csuper.acceptCash(num*price);
		total += itemPrice;
		System.out.println("单价：" + price + "，数量：" + num + "，合计：" + itemPrice);
	}
	
	public static void main(String[] args) {
		consume("正常收费", 1, 1000);		//submit
		consume("满300减100", 1, 1000);
		consume("打8折", 1, 1000);
		
		System.out.println("总计：" + total);		
	}
}
