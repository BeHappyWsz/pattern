package factory.manyFactory;

import factory.Human;

/**
 * 多工厂抽象工厂类
 * @author wsz
 * @date 2018年2月1日
 */
public abstract class AbstractHumanFactory {
	public abstract Human createHuman();
}
