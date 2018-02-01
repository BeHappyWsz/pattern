package factory.simpleFactory;

import factory.Human;
/**
 * �򵥹�����
 * 1.�ṩ��̬�����������������
 * @author wsz
 * @date 2018��2��1��
 */
public class HumanFactory {

	@SuppressWarnings("unchecked")
	public static <T extends Human> T createHuman(Class<T> c) {
		Human human = null;
		try {
			human = (Human)Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			System.out.println("����ʧ��");
		}
		return (T)human;
	}
}
