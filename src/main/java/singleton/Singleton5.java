package singleton;
/**
 * ��������ģʽ
 * @author wsz
 * @date 2018��2��28��
 */
public class Singleton5 {

	private static Singleton5 instance = new Singleton5();
	
	private Singleton5() {}
	
	public static Singleton5 getInstance() {
		return instance;
	}
}
