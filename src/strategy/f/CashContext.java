package strategy.f;

//上下文，用一个具体策略来配置，维护一个对Strategy对象的引用
public class CashContext {
	private CashSuper cashSuper;
	
/*	public CashContext(CashSuper cashSuper) {
		this.cashSuper = cashSuper;
	}*/
	
	//原先是在构造器中传入CashSuper策略对象，
	//现在让这个策略模式的Context类，同时充当一个工厂类：
	//传入type变量，自行判断采用哪一种策略
	public CashContext(String type) {
		if (type.equals("正常收费"))
			cashSuper = new CashNormal();
		else if (type.equals("打8折"))
			cashSuper = new CashRebate(0.8);
		else if (type.equals("满300减100"))
			cashSuper = new CashReturn(300, 100);		
	}
	
	public double acceptCash(double money) {
		return cashSuper.acceptCash(money);
	}

}
