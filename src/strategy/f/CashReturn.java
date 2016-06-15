package strategy.f;

//返利结算子类
public class CashReturn implements CashSuper {
	private double moneyCond = 0;	//满多少
	private double moneyRet = 0;	//返多少
	
	public CashReturn(double cond, double ret) {
		this.moneyCond = cond;
		this.moneyRet = ret;
	}

	@Override
	public double acceptCash(double money) {
		if (money >= moneyCond)
			return (money - money/moneyCond*moneyRet);
		else
			return money;
	}

		
}
