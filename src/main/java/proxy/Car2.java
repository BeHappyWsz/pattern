package proxy;

public class Car2 extends Car{

	public void move() {
		long start = System.currentTimeMillis();
		super.move();
		long stop = System.currentTimeMillis();
		System.out.println("��ʻʱ��:"+(stop - start));
	}
}
