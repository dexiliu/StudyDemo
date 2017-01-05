package timetask;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleExecutorTest {

	private ScheduledExecutorService scheduExec;
	public long start;
	ScheduleExecutorTest(){
		this.scheduExec=Executors.newScheduledThreadPool(2);
		this.start=System.currentTimeMillis();
	}
	
	public void timerone(){
		scheduExec.schedule(new Runnable(){
			public void run(){
				System.out.println("timerone,the time:"+(System.currentTimeMillis()-start));
				try{
					Thread.sleep(4000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}
			}
		}, 1000, TimeUnit.MILLISECONDS);
	}
	
	public void timertwo(){
		scheduExec.schedule(new Runnable(){
			public void run(){
				System.out.println("timertwo,the time:"+(System.currentTimeMillis()-start));
			}
		}, 2000, TimeUnit.MILLISECONDS);
	}
	
	
	public void timerthree(){
		scheduExec.schedule(new Runnable(){
			public void run(){
				throw new RuntimeException();
			}
		}, 1000, TimeUnit.MILLISECONDS);
	}
	
	public void timerfour(){
		scheduExec.scheduleAtFixedRate(new Runnable(){
			public void run(){
				System.out.println("timertwo invoked……");
			}
		}, 2000, 5000, TimeUnit.MILLISECONDS);
	}
	
	public static void main(String[] args) {
		ScheduleExecutorTest test=new ScheduleExecutorTest();
		test.timerone();
		test.timertwo();
	}

}
