package proxy;

public class Car implements Moveable{

	public void move() {
		try {
			System.out.println("������ʻ��...");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
