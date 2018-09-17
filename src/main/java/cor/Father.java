package cor;

public class Father extends Handler{

	public Father() {
		super(Handler.FATHER_LEVEL_REQUEST);
	}

	@Override
	protected void response(IWomen women) {
		System.out.println("to father");
		System.out.println(women.getRequest());
		System.out.println("father:yes");
	}
	
}
