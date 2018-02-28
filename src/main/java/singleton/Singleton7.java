package singleton;
/**
 * 枚举方法实现单例
 * @author wsz
 * @date 2018年2月28日
 */
public enum Singleton7 {
	INSTANCE;
	
	public void print() {
		System.out.println("枚举方法");
	}
	
	public static void main(String[] args) {
		Singleton7 instance1 = Singleton7.INSTANCE;
		Singleton7 instance2 = Singleton7.INSTANCE;
		
		if(instance1 == instance2) {
			instance1.print();
		}else {
			System.out.println("非单例");
		}
	}
}
