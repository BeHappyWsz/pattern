package proxy;

public class Client {

	public static void main(String[] args) {
		//直接new
//		Car car = new Car();
//		car.move();
		//继承方法
//		Car2 car2 = new Car2();
//		car2.move();
		
		//实现同一个接口
//		Moveable car3 = new Car3(new Car());
//		car3.move();
		
		//重新声明代理类并实现同一个接口
		Car car = new Car();
		CarLogProxy log = new CarLogProxy(car);
		CarTimeProxy time = new CarTimeProxy(log);
		time.move(); 
	}
}
