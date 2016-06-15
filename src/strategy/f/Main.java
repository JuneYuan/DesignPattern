package strategy.f;

//客户端代码
public class Main {
	private static double total = 0;	//总计
	
	private static void consume(String type, int num, int price) {
		CashContext cashContext = new CashContext(type);
		
		double itemPrice = cashContext.acceptCash(num*price);
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
