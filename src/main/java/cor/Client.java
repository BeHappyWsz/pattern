package cor;

import java.util.ArrayList;
import java.util.Random;

public class Client {

	public static void main(String[] args) {
		
		Random r = new Random();
		ArrayList<IWomen> arrayList = new ArrayList<IWomen>();
		
		for(int i=0; i<5; i++) {
			arrayList.add(new Women(r.nextInt(5),"go shopping"));
		}
		
		Handler father = new Father();
		Handler husband = new Husband();
		Handler son = new Son();
		
		father.setNext(husband);
		husband.setNext(son);
		for (IWomen iWomen : arrayList) {
			father.HandleMessage(iWomen);
		}
	}
}
