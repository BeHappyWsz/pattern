package singleton;
/**
 * 基础懒汉模式
 * @author wsz
 * @date 2018年2月28日
 */
public class Singleton1 {
	private static Singleton1 instance = null;
	
	private Singleton1() {}
	
	public static Singleton1 getInstance(){
		if(null == instance)
			instance = new Singleton1();
		return instance;
	}
}
