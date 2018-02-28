package proxy;
/**
 * 聚合方式
 * @author wsz
 * @date 2018年2月28日
 */
public class Car3 implements Moveable{

	private Car car;
	
	public Car3(Car car) {
		super();
		this.car = car;
	}
	
	public void move() {
		long start = System.currentTimeMillis();
		car.move();
		long stop = System.currentTimeMillis();
		System.out.println("行驶时间:"+(stop - start));
	}

}
