package cor;

public class Son extends Handler{

	public Son() {
		super(Handler.SON_LEVEL_REQUEST);
	}

	@Override
	protected void response(IWomen women) {
		System.out.println("to son");
		System.out.println(women.getRequest());
		System.out.println("son:yes");
	}

}
