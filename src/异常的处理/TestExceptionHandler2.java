package 异常的处理;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TestExceptionHandler2 {
	
	public static void main(String[] args){

		File file = new File("e:\\HelloWorld.java");
		
		
		FileInputStream is;
		try {
			is = new FileInputStream(file);
			int result = is.read();//根据提示选择clause to surrounding by 
			Class.forName("java.a.b");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e1) {

			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		

		
	
	

	}

}
