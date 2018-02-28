package singleton;
/**
 * 懒汉模式之volatile修饰
 * @author wsz
 * @date 2018年2月28日
 */
public class Singleton4 {

	private static volatile Singleton4 instance = null;

	private Singleton4() {}
	
	public static synchronized Singleton4 getInstance() {
		if(null == instance) {
			synchronized (Singleton4.class) {
				if(null == instance)
					instance = new Singleton4();
			}
		}
		return instance;
	}
}
