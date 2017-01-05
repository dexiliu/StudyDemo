package thread;

public class Thread2 implements Runnable {

	private int count=15;
	
	public static void main(String[] args) {
		Thread2 t1=new Thread2();
		Thread2 t2=new Thread2();
		Thread2 t3=new Thread2();
		Thread t=new Thread(t1,"C");
		t.setPriority(Thread.MAX_PRIORITY);
		t.start();
		new Thread(t2,"D").start();
		new Thread(t2,"E").start();
	}

	public void run() {
		for(int i=0;i<5;i++){
			System.out.println(Thread.currentThread().getName()+"运行 count="+count--);
			try{
				Thread.sleep((int)Math.random()*10);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

}
