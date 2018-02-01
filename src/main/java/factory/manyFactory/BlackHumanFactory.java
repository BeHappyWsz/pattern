package factory.manyFactory;

import factory.BlackHuman;
import factory.Human;

public class BlackHumanFactory extends AbstractHumanFactory{

	@Override
	public Human createHuman() {
		return new BlackHuman();
	}
}
