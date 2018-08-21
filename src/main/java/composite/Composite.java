package composite;

import java.util.ArrayList;

/**
 * 树枝构件
 * @author wsz
 * @date 2018年8月21日
 */
public class Composite extends Component{

	private ArrayList<Component> componentList = new ArrayList<Component>();
	// 增加一个叶子/树枝构件
	public void add(Component com) {
		this.componentList.add(com);
	}
	// 删除一个叶子/树枝构件
	public void remove(Component com) {
		this.componentList.remove(com);
	}
	// 获取分支下的所有叶子构件和树枝构件
	public ArrayList<Component> getChildren(){
		return this.componentList;
	}
}
