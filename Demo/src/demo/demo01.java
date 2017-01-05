package demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class demo01 {

	public static void main(String[] args) {
		// 字符串转换日期格式  
	    // DateFormat fmtDateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
	    // 得到日期格式对象  
	    // Date date = fmtDateTime.parse(strDateMake);  
	  
	    // 完整显示日期时间  
	    String str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS")).format(new Date());  
	    System.out.println(str);  
	  
	    // 创建 Calendar 对象  
	    Calendar calendar = Calendar.getInstance();  
	    // 初始化 Calendar 对象，但并不必要，除非需要重置时间  
	    calendar.setTime(new Date());  
	  
	    // setTime 类似上面一行  
	    // Date date = new Date();  
	    // calendar.setTime(date);  
	  
	    // 显示年份  
	    int year = calendar.get(Calendar.YEAR);  
	    System.out.println("YEAR is = " + String.valueOf(year));  
	  
	    // 显示月份 (从0开始, 实际显示要加一)  
	    int MONTH = calendar.get(Calendar.MONTH);  
	    System.out.println("MONTH is = " + (MONTH + 1));  
	  
	    // 今年的第 N 天  
	    int DAY_OF_YEAR = calendar.get(Calendar.DAY_OF_YEAR);  
	    System.out.println("DAY_OF_YEAR is = " + DAY_OF_YEAR);  
	  
	    // 本月第 N 天  
	    int DAY_OF_MONTH = calendar.get(Calendar.DAY_OF_MONTH);  
	    System.out.println("DAY_OF_MONTH = " + String.valueOf(DAY_OF_MONTH));  
	  
	    // 3小时以后  
	    calendar.add(Calendar.HOUR_OF_DAY, 3);  
	    int HOUR_OF_DAY = calendar.get(Calendar.HOUR_OF_DAY);  
	    System.out.println("HOUR_OF_DAY + 3 = " + HOUR_OF_DAY);  
	  
	    // 当前分钟数  
	    int MINUTE = calendar.get(Calendar.MINUTE);  
	    System.out.println("MINUTE = " + MINUTE);  
	  
	    // 15 分钟以后  
	    calendar.add(Calendar.MINUTE, 15);  
	    MINUTE = calendar.get(Calendar.MINUTE);  
	    System.out.println("MINUTE + 15 = " + MINUTE);  
	  
	    // 30分钟前  
	    calendar.add(Calendar.MINUTE, -30);  
	    MINUTE = calendar.get(Calendar.MINUTE);  
	    System.out.println("MINUTE - 30 = " + MINUTE);  
	  
	    //2天前
	    calendar.add(Calendar.DAY_OF_MONTH, -2);
	    // 格式化显示  
	    str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS")).format(calendar.getTime());  
	    System.out.println(str);  
	  
	    // 重置 Calendar 显示当前时间  
	    calendar.setTime(new Date());  
	    str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS")).format(calendar.getTime());  
	    System.out.println(str);  
	  
	    // 创建一个 Calendar 用于比较时间  
	    Calendar calendarNew = Calendar.getInstance();  
	  
	    // 设定为 5 小时以前，后者大，显示 -1  
	    calendarNew.add(Calendar.HOUR, -5);  
	    System.out.println("时间比较：" + calendarNew.compareTo(calendar));  
	  
	    // 设定7小时以后，前者大，显示 1  
	    calendarNew.add(Calendar.HOUR, +7);  
	    System.out.println("时间比较：" + calendarNew.compareTo(calendar));  
	  
	    // 退回 2 小时，时间相同，显示 0  
	    calendarNew.add(Calendar.HOUR, -2);  
	    System.out.println("时间比较：" + calendarNew.compareTo(calendar));  
	  } 
	
	
	/**
	 * 两个时间差
	 */
	public static void time(){
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		try {
			Date d1=df.parse("2015-07-05 24:59:21");
			Date d2=df.parse("2015-07-06 1:00:00");
			long t=d2.getTime()-d1.getTime();
			long day=t/(60*60*1000*24);
			long hour=(t/(60*60*1000)-day*24);
			long min=((t/(1000*60))-day*24*60-hour*60);
			long s=(t/1000-min*60-hour*60*60-day*24*60*60);
			System.out.println(day+"天"+hour+"小时"+min+"分"+s+"秒");
			
			long ten=10*60*1000;
			if(t>ten){
				System.out.println("大于10分钟!");
			}else{
				System.out.println("小于10分钟！");
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
