package cor;
/**
 * 抽象处理类
 * @author wsz
 * @date 2018年9月17日
 */
public abstract class Handler {

	public final static int FATHER_LEVEL_REQUEST = 1;
	public final static int HUSBAND_LEVEL_REQUEST = 2;
	public final static int SON_LEVEL_REQUEST = 3;
	
	private int level = 0;
	
	private Handler nextHandler;
	
	public Handler(int level) {
		this.level = level;
	}
	//每个处理者都必须对请求做出处理
	public final void HandleMessage(IWomen women) {
		// 判断是否是自己处理级别
		if(women.getType() == this.level) {
			this.response(women);
		}else {
			//向下一个处理者发送
			if(this.nextHandler != null) {
				this.nextHandler.HandleMessage(women);
			}else {
				System.out.println("--后续没有");
			}
		}
	}
	// 设置下一个处理者
	public void setNext(Handler handler) {
		this.nextHandler = handler;
	}
	// 每个处理者都必须实现处理任务
	protected abstract void response(IWomen women);
}
