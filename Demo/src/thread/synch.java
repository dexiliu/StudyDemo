package thread;

public class synch implements Runnable{

	public void run(){
		for(int i=0;i<10;++i){
			synchronized(this){
				if(count>0){
					try{
						Thread.sleep(1000);
					}catch(InterruptedException e){
						e.printStackTrace();
					}
					System.out.println(count--);
				}
			}
			
		}
	}
	
	private int count=5;
	
	public static void main(String[] args) {
		synch sy=new synch();
		Thread h1=new Thread(sy);
		Thread h2=new Thread(sy);
		Thread h3=new Thread(sy);
		
		h1.start();
		h2.start();
		h3.start();
	}

}
