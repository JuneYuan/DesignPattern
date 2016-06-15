package strategy.d;

//上下文，用一个具体策略来配置，维护一个对Strategy对象的引用
public class Context {
	private Strategy strategy;
	
	public Context(Strategy strategy) {
		this.strategy = strategy;
	}
	
	public void contextInterface() {
		strategy.algorithmInterface();
	}

}
