package adapter.a;

// 客户端代码
public class Main {
	public static void main(String[] args) {
		Target target = new Adapter();
		target.request();
	}
}
