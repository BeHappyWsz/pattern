package composite;

/**
 * 场景类测试
 * @author wsz
 * @date 2018年8月21日
 */
public class Client {

	/*
	 * 	     			  root
	 * 	    branch_1_left     branch_1_right
	 *      left	right         left_1
	 */
	public static void main(String[] args) {
		// 根节点
		Composite root = new Composite();
		root.doSomething();
		// 树枝+叶子节点
		Composite branch_1_left = new Composite();
		root.add(branch_1_left);
		
		Leaf left = new Leaf();
		branch_1_left.add(left);
		Leaf right = new Leaf();
		branch_1_left.add(right);
		
		Composite branch_1_right = new Composite();
		root.add(branch_1_right);
		Leaf left_1 = new Leaf();
		branch_1_right.add(left_1);
		
		showChildren(root);
	}
	// 递归遍历树
	public static void showChildren(Composite root) {
		for (Component com : root.getChildren()) {
			if(com instanceof Leaf) {
				com.doSomething();
				System.out.println("叶子节点");
			} else {
				showChildren((Composite) com);
			}
		}
	}
}
