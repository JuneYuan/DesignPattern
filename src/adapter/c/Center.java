package adapter.c;

public class Center extends Player {
	
	public Center(String name) {
		super(name);
	}
	
	public void attack(){
		System.out.println("中锋" + name + "进攻");
	}
	
	public void defense() {
		System.out.println("中锋" + name + "防守");
	}

	
}
