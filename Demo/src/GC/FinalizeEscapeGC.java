package GC;

public class FinalizeEscapeGC {

	public static void main(String[] args) throws InterruptedException {

		SAVE_HOOK=new FinalizeEscapeGC();
		
		//对象第一次成功拯救自己
		SAVE_HOOK=null;
		System.gc();
		//因为finalize方法优先级很低，所以暂停0.5秒以等待它
		Thread.sleep(500);
		if(SAVE_HOOK!=null){
			SAVE_HOOK.isAlive();
		}else{
			System.out.println("no,i am dead :(");
		}
		
		//下面这段代码与上面的的完成相同，但是这次自救却失败
		SAVE_HOOK=null;
		System.gc();
		//因为finalize方法优先级很低
		Thread.sleep(500);
		if(SAVE_HOOK!=null){
			SAVE_HOOK.isAlive();
		}else{
			System.out.println("no,i am dead:(");
		}
	}
	
	public static FinalizeEscapeGC SAVE_HOOK=null;
	
	public void isAlive(){
		System.out.println("Yes,I am still alive!");
	}
	
	protected void finalize() throws Throwable{
		super.finalize();
		System.out.println("finalize method excetued!");
		FinalizeEscapeGC.SAVE_HOOK=this;
	}

}
