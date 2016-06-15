package strategy.e;

//打折结算子类
public class CashRebate implements CashSuper {
	private double rebate = 1;
	
	public CashRebate(double rebate) {
		this.rebate = rebate;
	}

	@Override
	public double acceptCash(double money) {
		return money*rebate;
	}

		
}
