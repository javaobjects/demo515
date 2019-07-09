package 异常的处理;

public class TestExceptionHandler {
	
	public int sum(int a,int b) {
		return a + b;
	}
	
	public static void main(String[] args) throws ClassNotFoundException {//2.消积处理

		//模拟异常，看怎么处理？
		
		//2.消积处理：异常抛出虚拟机，程序终止
		Class.forName("java.a.Date");
		
		//1.积极处理:程序继续执行完毕
//		try {
//			Class.forName("java.a.Date");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		for (int i = 0; i < 100; i++) {
//			System.out.println(i);
//		}

	}

}
