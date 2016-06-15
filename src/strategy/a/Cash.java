package strategy.a;

public class Cash
{
	private double	total	= 0;
		
	public void submit(int num, double price)
	{
		double totalPrices = num * price;  //每种商品的总费用
		total += totalPrices;

		System.out.println("单价:" + price + " 数量:" + num + "合计:" + totalPrices);
	}

	public double getTotal()
	{
		return total;
	}

	public void setTotal(double total)
	{
		this.total = total;
	}

	public static void main(String[] args) {
		Cash cash = new Cash();
		cash.submit(2, 18);
		cash.submit(3, 1);
		System.out.println(cash.getTotal());
	}
}

