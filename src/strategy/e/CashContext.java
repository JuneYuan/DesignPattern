package strategy.e;

//上下文，用一个具体策略来配置，维护一个对Strategy对象的引用
public class CashContext {
	private CashSuper cashSuper;
	
	public CashContext(CashSuper cashSuper) {
		this.cashSuper = cashSuper;
	}
	
	public double acceptCash(double money) {
		return cashSuper.acceptCash(money);
	}

}
