package composite;

import java.util.ArrayList;

/**
 * ��֦����
 * @author wsz
 * @date 2018��8��21��
 */
public class Composite extends Component{

	private ArrayList<Component> componentList = new ArrayList<Component>();
	// ����һ��Ҷ��/��֦����
	public void add(Component com) {
		this.componentList.add(com);
	}
	// ɾ��һ��Ҷ��/��֦����
	public void remove(Component com) {
		this.componentList.remove(com);
	}
	// ��ȡ��֧�µ�����Ҷ�ӹ�������֦����
	public ArrayList<Component> getChildren(){
		return this.componentList;
	}
}
