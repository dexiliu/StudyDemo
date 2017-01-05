package thread;

public class Thead1 extends Thread {

	private int count=5;
	private String name;
	public Thead1(String name){
		this.name=name;
	}
	
	public void run(){
		for(int i=0;i<5;i++){
			System.out.println(name+"运行 count="+count--);
			try{
				Thread.sleep((int)Math.random()*10);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		Thead1 t1=new Thead1("A");
		Thead1 t2=new Thead1("B");
		t1.start();
		t2.start();
	}

}
