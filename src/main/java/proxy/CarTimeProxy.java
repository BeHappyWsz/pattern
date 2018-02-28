package proxy;

public class CarTimeProxy implements Moveable{

	private Moveable car;
	
	public CarTimeProxy(Moveable m) {
		this.car = m;
	}
	
	public void move() {
		long start =System.currentTimeMillis();
		System.out.println("������ʼ��ʻ");
		car.move();
		long stop =System.currentTimeMillis();
		System.out.println("����ֹͣ:"+(stop-start));
	}

}
