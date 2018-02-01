package factory.factory;

import factory.BlackHuman;
import factory.WhiteHuman;
import factory.YellowHuman;

public class Client {

	public static void main(String[] args) {
		AbstractHumanFactory factory = new HumanFactory();
		YellowHuman yellow = factory.createHuman(YellowHuman.class);
		BlackHuman  black  = factory.createHuman(BlackHuman.class);
		WhiteHuman  white  = factory.createHuman(WhiteHuman.class);
		
		yellow.getColor();yellow.talk();
		black.getColor();black.talk();
		white.getColor();white.talk();
	}
}
