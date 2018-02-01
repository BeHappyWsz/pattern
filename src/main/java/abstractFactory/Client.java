package abstractFactory;

import abstractFactory.factory.FemaleFactory;
import abstractFactory.factory.MaleFactory;

public class Client {

	public static void main(String[] args) {
		
		FemaleFactory femaleFactory = new FemaleFactory();
		MaleFactory   maleFactory   = new MaleFactory();
		
		/**   ������һ��       **/
		Human yellowFemaleHuman = femaleFactory.createYellowHuman();
		Human yellowMaleHuman   = maleFactory.createYellowHuman();
		
		yellowFemaleHuman.getColor();yellowFemaleHuman.talk();yellowFemaleHuman.getSex();
		yellowMaleHuman.getColor();yellowMaleHuman.talk();yellowMaleHuman.getSex();
		
		/**   �����ڶ���       **/
		Human blackFemaleHuman = femaleFactory.createBlackHuman();
		Human blackMaleHuman   = maleFactory.createBlackHuman();
		
		blackFemaleHuman.getColor();blackFemaleHuman.talk();blackFemaleHuman.getSex();
		blackMaleHuman.getColor();blackMaleHuman.talk();blackMaleHuman.getSex();
		
		/**   ����������       **/
		Human whiteFemaleHuman = femaleFactory.createWhiteHuman();
		Human whiteMaleHuman   = maleFactory.createWhiteHuman();
		
		whiteFemaleHuman.getColor();whiteFemaleHuman.talk();whiteFemaleHuman.getSex();
		whiteMaleHuman.getColor();whiteMaleHuman.talk();whiteMaleHuman.getSex();
	}

}
