package singleton;
/**
 * 饿汉模式之静态内部类
 * @author wsz
 * @date 2018年2月28日
 */
public class Singleton6 {
	private Singleton6() {}
	
	private static class SingletonHolder{
		private static Singleton6 instance = new Singleton6();
	}
	
	public static Singleton6 getInstance() {
		return SingletonHolder.instance;
	}
}
