package singleton;
/**
 * ��������ʽ��ȡ��������ͬ������
 * @author wsz
 * @date 2018��2��28��
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
