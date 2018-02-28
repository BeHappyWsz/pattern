package singleton;
/**
 * ����ģʽ֮volatile����
 * @author wsz
 * @date 2018��2��28��
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
