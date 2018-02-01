package factory.factory;

import factory.Human;

/**
 * 具体工厂类
 * @author wsz
 * @date 2018年2月1日
 */
public class HumanFactory extends AbstractHumanFactory{

	@SuppressWarnings("unchecked")
	@Override
	public <T extends Human> T createHuman(Class<T> c) {
		Human human = null;
		try {
			human = (Human) Class.forName(c.getName()).newInstance();
		}catch (Exception e) {
			System.out.println("生成错误");
		}
		return (T) human;
	}

}
