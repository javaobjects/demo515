package 自定义异常;

public class Test {

	public static void main(String[] args) {
		ProductService service = new ProductService();
		
		try {
			service.queryProduct(0);
		} catch (ProductNotExistException e) {
			e.printStackTrace();
		}
	}
}
