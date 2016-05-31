package adapter.b;


// 翻译者类 
public class Translator extends Player {
	private ForeignCenter wjzf = new ForeignCenter();
	
	public Translator(String name) {
		super(name);
		wjzf.setName(name);
	}
	
	public void attack() {
		wjzf.JinGong();
	}
	
	public void defense() {
		wjzf.FangShou();
	}
}
