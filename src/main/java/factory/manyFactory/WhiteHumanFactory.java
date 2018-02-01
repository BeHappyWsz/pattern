package factory.manyFactory;

import factory.Human;
import factory.WhiteHuman;

public class WhiteHumanFactory extends AbstractHumanFactory{

	@Override
	public Human createHuman() {
		return new WhiteHuman();
	}

}
