package proxy;

public class Car2 extends Car{

	public void move() {
		long start = System.currentTimeMillis();
		super.move();
		long stop = System.currentTimeMillis();
		System.out.println("ÐÐÊ»Ê±¼ä:"+(stop - start));
	}
}
