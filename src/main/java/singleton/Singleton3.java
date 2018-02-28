package singleton;
/**
 * 懒汉模式之双重锁
 * @author wsz
 * @date 2018年2月28日
 */
public class Singleton3 {

	private static Singleton3 instance = null;
	
	private Singleton3() {}
	
	public static synchronized Singleton3 getInstance() {
		if(null == instance) {
			synchronized (Singleton3.class) {
				if(null == instance)
					instance = new Singleton3();
			}
		}
		return instance;
	}
}
