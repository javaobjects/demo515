package 异常的处理;

public class Test {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		int b = 0;
		int a = 10 / b;
		
		for (int i = 0; i < 10; i++) {
			System.out.println("i: " + i);
		}
	}

}
