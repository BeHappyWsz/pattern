package factory.manyFactory;

import factory.Human;

public class Client {

	public static void main(String[] args) {
		Human yellow = new YellowHumanFactory().createHuman();
		Human black  = new BlackHumanFactory().createHuman();
		Human white  = new WhiteHumanFactory().createHuman();
		
		yellow.getColor();yellow.talk();
		black.getColor();black.talk();
		white.getColor();white.talk();
	}
}
