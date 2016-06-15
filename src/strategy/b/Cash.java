package strategy.b;

public class Cash {
	private double total = 0; // 总计
	private int selectedIndex = 0; // 下拉菜单选项

	public void selectFormLoad() {
		String[] selectForm = { "正常收费", "打8折", "打7折", "打5折" };
		selectedIndex = 0;
	}

	public void submit(int num, double price) {
		double totalPrices = 0;
		switch (selectedIndex) {
		case 0:
			totalPrices = num * price;
			break;
		case 1:
			totalPrices = num * price * 0.8;
			break;
		case 2:
			totalPrices = num * price * 0.7;
			break;
		case 3:
			totalPrices = num * price * 0.5;
			break;
		}
		total += totalPrices;

		System.out.println("单价:" + price + " 数量:" + num + "合计:" + totalPrices);
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public int getSelectedIndex() {
		return selectedIndex;
	}

	public void setSelectedIndex(int selectedIndex) {
		this.selectedIndex = selectedIndex;
	}

	public static void main(String[] args) {
		Cash cash = new Cash();
		
		cash.setSelectedIndex(0);	//正常收费
		cash.submit(1000, 1);
		cash.setSelectedIndex(1);	//8折
		cash.submit(1000, 1);
		cash.setSelectedIndex(2);	//7折
		cash.submit(1000, 1);
		
		System.out.println(cash.getTotal());
	}
}
