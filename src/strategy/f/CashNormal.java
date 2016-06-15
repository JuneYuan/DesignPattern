package strategy.f;

//正常结算子类
public class CashNormal implements CashSuper {

	@Override
	public double acceptCash(double money) {
		return money;
	}
		
}
