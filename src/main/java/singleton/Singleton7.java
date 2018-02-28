package singleton;
/**
 * ö�ٷ���ʵ�ֵ���
 * @author wsz
 * @date 2018��2��28��
 */
public enum Singleton7 {
	INSTANCE;
	
	public void print() {
		System.out.println("ö�ٷ���");
	}
	
	public static void main(String[] args) {
		Singleton7 instance1 = Singleton7.INSTANCE;
		Singleton7 instance2 = Singleton7.INSTANCE;
		
		if(instance1 == instance2) {
			instance1.print();
		}else {
			System.out.println("�ǵ���");
		}
	}
}
