package adapter.b;

public class Forwards extends Player {
	
	public Forwards(String name) {
		super(name);
	}
	
	public void attack(){
		System.out.println("前锋" + name + "进攻");
	}
	
	public void defense() {
		System.out.println("前锋" + name + "防守");
	}

	
}
