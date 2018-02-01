package factory.factory;

import factory.Human;

/**
 * ���幤����
 * @author wsz
 * @date 2018��2��1��
 */
public class HumanFactory extends AbstractHumanFactory{

	@SuppressWarnings("unchecked")
	@Override
	public <T extends Human> T createHuman(Class<T> c) {
		Human human = null;
		try {
			human = (Human) Class.forName(c.getName()).newInstance();
		}catch (Exception e) {
			System.out.println("���ɴ���");
		}
		return (T) human;
	}

}
