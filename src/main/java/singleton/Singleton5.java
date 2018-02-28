package singleton;
/**
 * 基础饿汉模式
 * @author wsz
 * @date 2018年2月28日
 */
public class Singleton5 {

	private static Singleton5 instance = new Singleton5();
	
	private Singleton5() {}
	
	public static Singleton5 getInstance() {
		return instance;
	}
}
