package 异常的处理;

public class Test {

	public static void main(String[] args) {
		
//		double p = "";//这是语法错误，称不上异常
		/**
		 * 异常：
		 * 代码运行期间出现的错误
		 * 打开一个不存在的文件
		 * 网络连接中断
		 * 操作数组越界等
		 */
		
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
