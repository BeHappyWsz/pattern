package proxy;

public class Client {

	public static void main(String[] args) {
		//ֱ��new
//		Car car = new Car();
//		car.move();
		//�̳з���
//		Car2 car2 = new Car2();
//		car2.move();
		
		//ʵ��ͬһ���ӿ�
//		Moveable car3 = new Car3(new Car());
//		car3.move();
		
		//�������������ಢʵ��ͬһ���ӿ�
		Car car = new Car();
		CarLogProxy log = new CarLogProxy(car);
		CarTimeProxy time = new CarTimeProxy(log);
		time.move(); 
	}
}
