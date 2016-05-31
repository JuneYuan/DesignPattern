package adapter.b;

// 外籍中锋  
public class ForeignCenter{
	private String name;
	
	public void JinGong() {
		System.out.println("外籍中锋" + name + "进攻");
	}
	
	public void FangShou() {
		System.out.println("外籍中锋" + name + "防守");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
