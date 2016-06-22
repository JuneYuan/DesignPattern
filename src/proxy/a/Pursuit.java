package proxy.a;

//追求者类
public class Pursuit {
	SchoolGirl mm;
	
	public Pursuit(SchoolGirl mm) {
		this.mm = mm;
	}
	
	public void giveDolls() {
		System.out.println(mm.name + "，送你洋娃娃");
	}

	public void giveFlowers() {
		System.out.println(mm.name + "，送你鲜花");
	}

	public void giveChocolate() {
		System.out.println(mm.name + "，送你巧克力");
	}

}
