package 异常的处理;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestExceptionHandler2 {
	
	public static void main(String[] args){

		File file = new File("e:\\HelloWorld.java");
		
		
		FileInputStream is = null;
		try {
			is = new FileInputStream(file);
			int result = is.read();//根据提示选择clause to surrounding by 
			
			
			Class.forName("java.a.b");
//		} catch (ClassNotFoundException | IOException e) {//Java7对catch的改写，可以多个异常同时写
//			e.printStackTrace();
		} catch (FileNotFoundException e) {
			System.out.println("a");
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {

			e1.printStackTrace();
		} catch (IOException e) {
			System.out.println("b");
			e.printStackTrace();
//1.finally语句块有什么 作用？
//	用于释放资源，即使代码抛出异常，
//	finally语句块中的代码也会执行
		}finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
//2.final finalize finally 有什么区别？
/**
 * final 修饰的类不能有子类 
 *       修饰的方法不能重写 
 *       修饰的变量不能重新赋值，叫常量
 * finalize：如果发现有垃圾对象的话就会调用finalize()方法，释放它所占用的内存 
 * finally: 确保我们程序当中有些释放资源的方法能够执行，
 * 			一般跟在try catch语句块后面     	
 */

	}

}
