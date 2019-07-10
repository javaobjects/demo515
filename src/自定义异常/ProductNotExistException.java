package 自定义异常;

/**
 * 自定义异常：商品不存在异常
 * 
 * 自定义异常的要求：
 * 1、继承Exception
 * 2、复写
* <p>Title: ProcutNotExistException</p>  
* <p>Description: </p>  
* @author xianxian 
* @date 2019年7月10日
 */
public class ProductNotExistException extends Exception{
	
	/** 
	* serialVersionUID
	* 关于serialVersionUID讲解比较详细的博客
	* https://blog.csdn.net/wuzhong8809/article/details/83416579
	* https://blog.csdn.net/u014750606/article/details/80040130
	*/  
	private static final long serialVersionUID = -1046619572695534339L;

	//Eclipse: source ---> generate constructors from superclass
	/**
	 * 当要抛出异常时会调用该构造方法，实例化一个异常对象
	* <p>Title: </p>  
	* <p>Description: </p>  
	* @param message
	 */
	public ProductNotExistException(String message) {
		super(message);
	}
}
