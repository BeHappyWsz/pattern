package factory.simpleFactory;

import factory.BlackHuman;
import factory.WhiteHuman;
import factory.YellowHuman;

/**
 * �򵥹���������
 * @author wsz
 * @date 2018��2��1��
 */
public class Client {
	
	public static void main(String[] args) {
		YellowHuman yellow = HumanFactory.createHuman(YellowHuman.class);
		BlackHuman  black  = HumanFactory.createHuman(BlackHuman.class);
		WhiteHuman  white  = HumanFactory.createHuman(WhiteHuman.class);
		
		yellow.getColor();yellow.talk();
		black.getColor();black.talk();
		white.getColor();white.talk();
	}
}
