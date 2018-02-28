package singleton;
/**
 * ����ģʽ֮��̬�ڲ���
 * @author wsz
 * @date 2018��2��28��
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
