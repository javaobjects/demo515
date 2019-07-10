package 异常的处理;

import java.io.File;
import java.io.FileInputStream;


public class TestRuntimeException {

	public static void main(String[] args) throws Exception {//消积处理
//		String a = null;
//		System.out.println(a.length());//java.lang.NullPointerException
		
		File file = new File("e:\\HelloWorld.java");
		
		
//		try {
//			FileInputStream is = new FileInputStream(file);
//			
//			int result = is.read();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}//积极处理
		
		FileInputStream is = new FileInputStream(file);
		
		int result = is.read();
	}
}
