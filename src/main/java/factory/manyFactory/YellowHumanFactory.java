package factory.manyFactory;

import factory.Human;
import factory.YellowHuman;

public class YellowHumanFactory extends AbstractHumanFactory{

	@Override
	public Human createHuman() {
		return new YellowHuman();
	}

}
