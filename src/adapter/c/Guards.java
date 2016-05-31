package adapter.c;

public class Guards extends Player {
	
	public Guards(String name) {
		super(name);
	}
	
	public void attack(){
		System.out.println("后卫" + name + "进攻");
	}
	
	public void defense() {
		System.out.println("后卫" + name + "防守");
	}

	
}
