package dynamic;

import java.lang.reflect.Method;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import code.A;

public class TimerTest03 {

	Timer timer;
	public TimerTest03(){
		timer=new Timer();
		timer.schedule(new TimerTaskTest03(), 1000,4000);//程序运行10秒后，开始每两秒执行
	}
	
	public static void main(String[] args) {
		new TimerTest03();
	}

}
	//程序运行10秒后，开始每两秒执行
	class TimerTaskTest03 extends TimerTask{

		@Override
		public void run() {
			ClassLoaderSub classLoaderSub = new ClassLoaderSub();
			try{
				Class clazz = classLoaderSub.getClassByFile("bin/code/A.class");
				System.out.println("类的名字:"+clazz.getName());
				System.out.println("类的加载器:"+clazz.getClassLoader());
				classLoaderSub.loadClass(A.class.getName());
				Object obj = clazz.newInstance();
				Method method = clazz.getMethod("print");
				method.invoke(obj);
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
		
	}

