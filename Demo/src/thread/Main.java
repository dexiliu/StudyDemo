package thread;

public class Main {

	public static void main(String[] args) {
				
		threadyield();
	}
	
	public static void threadyield(){
		Yield y1=new Yield("h1");
		Yield y2=new Yield("h2");
		y1.start();
		y2.start();
	}

	public static void threadjoin(){
		System.out.println(Thread.currentThread().getName()+"主线程开始运行！");
		Join j1=new Join("A");
		Join j2=new Join("B");
		j1.start();
		j2.start();
		try{
			j1.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		try{
			j2.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"主线程运行结束！");

	}
}
