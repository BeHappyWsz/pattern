package singleton;
/**
 * 基础懒汉式获取方法进行同步加锁
 * @author wsz
 * @date 2018年2月28日
 */
public class Singleton2 {
	private static Singleton2 instance = null;
	
	private Singleton2() {}
	
	public static synchronized Singleton2 getInstance() {
		if(null == instance)
			instance = new Singleton2();
		return instance;
	}
}
