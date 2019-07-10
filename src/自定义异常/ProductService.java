package 自定义异常;

public class ProductService {

	/**
	 * 查找商品的方法
	 * @throws ProductNotExistException 
	 */
	public void queryProduct(int id) throws ProductNotExistException {
		if(id == 0) {
			throw new ProductNotExistException("商品不存在");
		}else {
			System.out.println("找到商品了");
		}
	}
}
