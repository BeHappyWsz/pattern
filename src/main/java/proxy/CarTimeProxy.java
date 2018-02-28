package proxy;

public class CarTimeProxy implements Moveable{

	private Moveable car;
	
	public CarTimeProxy(Moveable m) {
		this.car = m;
	}
	
	public void move() {
		long start =System.currentTimeMillis();
		System.out.println("汽车开始行驶");
		car.move();
		long stop =System.currentTimeMillis();
		System.out.println("汽车停止:"+(stop-start));
	}

}
