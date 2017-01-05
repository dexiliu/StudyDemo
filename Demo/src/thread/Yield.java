package thread;

public class Yield extends Thread {

	public Yield(String name){
		super(name);
	}
	
	public void run(){
		for(int i=0;i<50;i++){
			System.out.println(""+this.getName()+"----"+i);
			if(i==30){
				this.yield();
			}
		}
	}

}
