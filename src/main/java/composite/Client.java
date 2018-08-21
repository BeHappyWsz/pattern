package composite;

/**
 * ���������
 * @author wsz
 * @date 2018��8��21��
 */
public class Client {

	/*
	 * 	     			  root
	 * 	    branch_1_left     branch_1_right
	 *      left	right         left_1
	 */
	public static void main(String[] args) {
		// ���ڵ�
		Composite root = new Composite();
		root.doSomething();
		// ��֦+Ҷ�ӽڵ�
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
	// �ݹ������
	public static void showChildren(Composite root) {
		for (Component com : root.getChildren()) {
			if(com instanceof Leaf) {
				com.doSomething();
				System.out.println("Ҷ�ӽڵ�");
			} else {
				showChildren((Composite) com);
			}
		}
	}
}
