package proxy;

public class CarLogProxy implements Moveable{

	private Moveable car;
	
	public CarLogProxy(Moveable m) {
		this.car = m;
	}
	
	public void move() {
		System.out.println("CarLogProxy��¼��־��ʼ");
		car.move();
		System.out.println("CarLogProxy��¼��־����");
	}

}
