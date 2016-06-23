package factory.c;

//客户端代码
public class Main {
	public static void main(String[] args) {
/*		LeiFeng student1 = SimpleFactory.createLeiFeng("学雷锋的大学生");		
		student1.buyRice();
		
		LeiFeng student2 = SimpleFactory.createLeiFeng("学雷锋的大学生");
		student2.sweep();
		
		LeiFeng student3 = SimpleFactory.createLeiFeng("学雷锋的大学生");
		student3.wash();*/
		
		IFactory factory = new UndergraduateFactory();
		LeiFeng student = factory.createLeiFeng();
		
		student.buyRice();
		student.sweep();
		student.wash();
	}
}
