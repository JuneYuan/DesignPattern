package strategy.c;

//现金工厂类
public class CashFactory {
	
	public static CashSuper createCash(String type) {
		CashSuper cs = null;
		if (type.equals("正常收费"))
			cs = new CashNormal();
		else if (type.equals("打8折"))
			cs = new CashRebate(0.8);
		else if (type.equals("满300减100"))
			cs = new CashReturn(300, 100);
		
		return cs;
	}

}
