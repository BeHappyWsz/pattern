package abstractFactory.factory;

import abstractFactory.Human;
import abstractFactory.black.FemaleBlackHuman;
import abstractFactory.white.FemaleWhiteHuman;
import abstractFactory.yellow.FemaleYellowHuman;

public class FemaleFactory implements HumanFactory{

	public Human createYellowHuman() {
		return new FemaleYellowHuman();
	}

	public Human createBlackHuman() {
		return new FemaleBlackHuman();
	}

	public Human createWhiteHuman() {
		return new FemaleWhiteHuman();
	}


}
