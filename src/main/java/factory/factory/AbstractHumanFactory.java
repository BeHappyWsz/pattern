package factory.factory;

import factory.Human;

/**
 * 抽象工厂类
 * 1.使用泛型
 * 2.必须实现Human接口
 * @author wsz
 * @date 2018年2月1日
 */
public abstract class AbstractHumanFactory {
	public abstract <T extends Human> T createHuman(Class<T> c);
}
