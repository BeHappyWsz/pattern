package factory.factory;

import factory.Human;

/**
 * ���󹤳���
 * 1.ʹ�÷���
 * 2.����ʵ��Human�ӿ�
 * @author wsz
 * @date 2018��2��1��
 */
public abstract class AbstractHumanFactory {
	public abstract <T extends Human> T createHuman(Class<T> c);
}
