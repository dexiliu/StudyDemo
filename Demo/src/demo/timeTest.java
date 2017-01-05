package demo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class timeTest {

	public static void main(String[] args) {
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(sdf.format(date));
		
		// 创建 Calendar 对象  
	    Calendar calendar2 = Calendar.getInstance(); 
	    calendar2.setTime(date);
//	    System.out.println(date.getHours());
//	    System.out.println(date.getMinutes());
//	    System.out.println(date.getSeconds());
	    
	    Calendar calendar7 = Calendar.getInstance(); 
	    calendar7.setTime(date);
	    
	    //2天前
	    calendar2.add(Calendar.DAY_OF_MONTH, -2);
//	    calendar2.add(Calendar.HOUR, -date.getHours());
//	    calendar2.add(Calendar.MINUTE, -date.getMinutes());
//	    calendar2.add(Calendar.SECOND, -date.getSeconds());
	    calendar2.set(Calendar.HOUR, 0);
	    calendar2.set(Calendar.MINUTE, 0);
	    calendar2.set(Calendar.SECOND, 0);
	    
	    // 格式化显示  
	    String str2 = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(calendar2.getTime());  
	    System.out.println(str2); 
	    
	    //7天前
	    calendar7.add(Calendar.DAY_OF_MONTH, -7);
//	    calendar7.add(Calendar.HOUR, -date.getHours());
//	    calendar7.add(Calendar.MINUTE, -date.getMinutes());
//	    calendar7.add(Calendar.SECOND, -date.getSeconds());
	    calendar7.set(Calendar.HOUR, 0);
	    calendar7.set(Calendar.MINUTE, 0);
	    calendar7.set(Calendar.SECOND, 0);
	    //格式化显示
	    String str7 = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(calendar7.getTime());  
	    System.out.println(str7);
	    
	    Calendar calendar = Calendar.getInstance(); 
	    calendar.setTime(date);
	    calendar.set(Calendar.HOUR_OF_DAY, 23);
	    calendar.set(Calendar.MINUTE, 59);
	    calendar.set(Calendar.SECOND, 59);
	    String str=(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")).format(calendar.getTime());
	    System.out.println(str);
	}

}
