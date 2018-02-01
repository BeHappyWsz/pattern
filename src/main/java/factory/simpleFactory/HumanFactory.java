package factory.simpleFactory;

import factory.Human;
/**
 * 简单工厂类
 * 1.提供静态方法来生产具体对象
 * @author wsz
 * @date 2018年2月1日
 */
public class HumanFactory {

	@SuppressWarnings("unchecked")
	public static <T extends Human> T createHuman(Class<T> c) {
		Human human = null;
		try {
			human = (Human)Class.forName(c.getName()).newInstance();
		} catch (Exception e) {
			System.out.println("创建失败");
		}
		return (T)human;
	}
}
