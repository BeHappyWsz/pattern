package abstractFactory.factory;

import abstractFactory.Human;
import abstractFactory.black.MaleBlackHuman;
import abstractFactory.white.MaleWhiteHuman;
import abstractFactory.yellow.MaleYellowHuman;

public class MaleFactory implements HumanFactory{

	public Human createYellowHuman() {
		return new MaleYellowHuman();
	}

	public Human createBlackHuman() {
		return new MaleBlackHuman();
	}

	public Human createWhiteHuman() {
		return new MaleWhiteHuman();
	}

}
