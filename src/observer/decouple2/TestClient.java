package observer.decouple2;

public class TestClient {
	public static void main(String[] args) {
		// 前台小组童子喆
		Boss huhansan = new Boss();
		
        // 看股票的同事  
		Observer tongshi1 = new StockObserver("魏关姹", huhansan);
		Observer tongshi2 = new NBAObserver("易管查", huhansan);
		
        //前台记下了两位同事  
		huhansan.attach(tongshi1);
		huhansan.attach(tongshi2);
		
		huhansan.detach(tongshi1);
		
        //发现老板回来  
		huhansan.setAction("我胡汉三回来了");
		
        //通知两个同事  
		huhansan.announce();
	}
}
