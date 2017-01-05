
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DateUtil {

	/**
	 * 日期类型转字符串类型
	 * 
	 * @param date
	 * @param dateFormat
	 * @return
	 */
	public static String dateToString(Date date, String dateFormat) {
		if (date == null)
			return "";
		try {
			return new SimpleDateFormat(dateFormat).format(date);
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}

	/**
	 * 日期类型转字符串类型，默认返回yyyy-MM-dd HH:mm:ss格式
	 * 
	 * @param date
	 * @return
	 */
	public static String dateToString(Date date) {
		return dateToString(date, "yyyy-MM-dd HH:mm:ss");
	}
	
	public static String dateToChinese(Date date) {
		return dateToString(date, "yyyy年MM月dd日HH:mm分");
	}
	
	public static String moonToChinese(Date date) {
		return dateToString(date, "MM月dd日");
	}
	
	public static String timeToChinese(Date date) {
		return dateToString(date, "HH:mm");
	}
	
	public static Date stringToDate(String date, String dateFormat)
	{
		try {
			SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
			return sdf.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  null;
	}
	
	/**
	 * 判断时间是早上还是中午还是晚上
	 * 早上:1,中午:2,晚上:3
	 * 针对学校的上学时间而定
	 * @param date
	 * @return
	 */
	public static int partOfDay(Date date)
	{
		if(null == date)
		{
			return 0;
		}
		
		Calendar c = Calendar.getInstance();   
		c.setTime(date);
		
		int hour = c.get(Calendar.HOUR_OF_DAY);
		
		if(hour >= 23)
		{
			return 4;
		}
		else if(hour > 18)
		{
			return 3;
		}
		else if(hour > 12)
		{
			return 2;
		}
		else if(hour >= 5)
		{
			return 1;
		}
		else if(hour >= 0)
		{
			return 5;
		}
		else
		{
			return 0;
		}
		
	}
	
	/** 
	 * 得到指定月的天数 
	 * */  
	public static int getMonthLastDay(int year, int month)  
	{  
	    Calendar a = Calendar.getInstance();  
	    a.set(Calendar.YEAR, year);  
	    a.set(Calendar.MONTH, month - 1);  
	    a.set(Calendar.DATE, 1);//把日期设置为当月第一天  
	    a.roll(Calendar.DATE, -1);//日期回滚一天，也就是最后一天  
	    int maxDate = a.get(Calendar.DATE);  
	    return maxDate;  
	}
	
	/**
	 * 获取星期六和星期日
	 * @param year
	 * @param month
	 * @return
	 */
	 public static String getSunSat(int year, int month)  
    {  
		String daystr = "";
        int days = getMonthLastDay(year, month);
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");  
        Calendar setDate = Calendar.getInstance();
        setDate.set(Calendar.YEAR, year);
        setDate.set(Calendar.MONTH, month - 1);//month是从0开始
        //从第一天开始  
        int day;  
        for (day = 1; day <= days; day++)  
        {  
            setDate.set(Calendar.DATE, day);  
            String str = sdf.format(setDate.getTime());  
            if (str.equals("星期日") || str.equals("星期六"))  
            {  
                //System.out.println(day + " " + str);
                daystr = daystr + day + ",";
            }
//            else
//            {
//            	System.out.println(day + " " + str);
//                
//            }
        }  
        return daystr;  
    }
	 
	 
	 

	public static void main(String[] args) {
		Date today = new Date();
		 Calendar c = Calendar.getInstance();   
		 c.setTime(today);
		 
		 Integer year = c.get(Calendar.YEAR);
		 Integer month = c.get(Calendar.MONTH)  + 1;
		 Integer day = c.get(Calendar.DAY_OF_MONTH);
		 
		 System.out.println(year);
		 System.out.println(month);
		 System.out.println(day);
	}

}
