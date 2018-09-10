package command.receiver;

public class PageGroup extends Group{

	@Override
	public void find() {
		System.out.println("page-find");
	}

	@Override
	public void add() {
		System.out.println("page-add");
	}

	@Override
	public void delete() {
		System.out.println("page-delete");
	}

	@Override
	public void change() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void plan() {
		System.out.println("page-plan");
	}


}
