package abstractFactory.factory;

import abstractFactory.Human;

public interface HumanFactory {
	Human createYellowHuman();
	Human createBlackHuman();
	Human createWhiteHuman();
}
