package proxy.a;

public class Main {

	public static void main(String[] args) {
		SchoolGirl jiaojiao = new SchoolGirl("jiaojiao");
		
		Pursuit zhuojiayi = new Pursuit(jiaojiao);
		
		zhuojiayi.giveDolls();
		zhuojiayi.giveFlowers();
		zhuojiayi.giveChocolate();
	}

}
