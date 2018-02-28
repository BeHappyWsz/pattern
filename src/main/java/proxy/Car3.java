package proxy;
/**
 * �ۺϷ�ʽ
 * @author wsz
 * @date 2018��2��28��
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
		System.out.println("��ʻʱ��:"+(stop - start));
	}

}
