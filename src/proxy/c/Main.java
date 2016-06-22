package proxy.c;

public class Main {

	public static void main(String[] args) {
		SchoolGirl jiaojiao = new SchoolGirl("jiaojiao");
		
		Proxy daili = new Proxy(jiaojiao);
		
		daili.giveDolls();
		daili.giveFlowers();
		daili.giveChocolate();
	}

}
