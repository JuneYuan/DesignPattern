package proxy.c;

//追求者类
public class Proxy {
	Pursuit gg;
	
	public Proxy(SchoolGirl mm) {
		gg = new Pursuit(mm);
	}
	
	public void giveDolls() {
		gg.giveDolls();
	}

	public void giveFlowers() {
		gg.giveFlowers();
	}

	public void giveChocolate() {
		gg.giveChocolate();
	}

}
