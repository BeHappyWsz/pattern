package factory.simpleFactory;

import factory.BlackHuman;
import factory.WhiteHuman;
import factory.YellowHuman;

/**
 * 简单工厂测试类
 * @author wsz
 * @date 2018年2月1日
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
