package proxy;

public class CarLogProxy implements Moveable{

	private Moveable car;
	
	public CarLogProxy(Moveable m) {
		this.car = m;
	}
	
	public void move() {
		System.out.println("CarLogProxy记录日志开始");
		car.move();
		System.out.println("CarLogProxy记录日志结束");
	}

}
