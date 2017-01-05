package demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class demo01 {

	public static void main(String[] args) {
		// �ַ���ת�����ڸ�ʽ  
	    // DateFormat fmtDateTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
	    // �õ����ڸ�ʽ����  
	    // Date date = fmtDateTime.parse(strDateMake);  
	  
	    // ������ʾ����ʱ��  
	    String str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS")).format(new Date());  
	    System.out.println(str);  
	  
	    // ���� Calendar ����  
	    Calendar calendar = Calendar.getInstance();  
	    // ��ʼ�� Calendar ���󣬵�������Ҫ��������Ҫ����ʱ��  
	    calendar.setTime(new Date());  
	  
	    // setTime ��������һ��  
	    // Date date = new Date();  
	    // calendar.setTime(date);  
	  
	    // ��ʾ���  
	    int year = calendar.get(Calendar.YEAR);  
	    System.out.println("YEAR is = " + String.valueOf(year));  
	  
	    // ��ʾ�·� (��0��ʼ, ʵ����ʾҪ��һ)  
	    int MONTH = calendar.get(Calendar.MONTH);  
	    System.out.println("MONTH is = " + (MONTH + 1));  
	  
	    // ����ĵ� N ��  
	    int DAY_OF_YEAR = calendar.get(Calendar.DAY_OF_YEAR);  
	    System.out.println("DAY_OF_YEAR is = " + DAY_OF_YEAR);  
	  
	    // ���µ� N ��  
	    int DAY_OF_MONTH = calendar.get(Calendar.DAY_OF_MONTH);  
	    System.out.println("DAY_OF_MONTH = " + String.valueOf(DAY_OF_MONTH));  
	  
	    // 3Сʱ�Ժ�  
	    calendar.add(Calendar.HOUR_OF_DAY, 3);  
	    int HOUR_OF_DAY = calendar.get(Calendar.HOUR_OF_DAY);  
	    System.out.println("HOUR_OF_DAY + 3 = " + HOUR_OF_DAY);  
	  
	    // ��ǰ������  
	    int MINUTE = calendar.get(Calendar.MINUTE);  
	    System.out.println("MINUTE = " + MINUTE);  
	  
	    // 15 �����Ժ�  
	    calendar.add(Calendar.MINUTE, 15);  
	    MINUTE = calendar.get(Calendar.MINUTE);  
	    System.out.println("MINUTE + 15 = " + MINUTE);  
	  
	    // 30����ǰ  
	    calendar.add(Calendar.MINUTE, -30);  
	    MINUTE = calendar.get(Calendar.MINUTE);  
	    System.out.println("MINUTE - 30 = " + MINUTE);  
	  
	    //2��ǰ
	    calendar.add(Calendar.DAY_OF_MONTH, -2);
	    // ��ʽ����ʾ  
	    str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS")).format(calendar.getTime());  
	    System.out.println(str);  
	  
	    // ���� Calendar ��ʾ��ǰʱ��  
	    calendar.setTime(new Date());  
	    str = (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SS")).format(calendar.getTime());  
	    System.out.println(str);  
	  
	    // ����һ�� Calendar ���ڱȽ�ʱ��  
	    Calendar calendarNew = Calendar.getInstance();  
	  
	    // �趨Ϊ 5 Сʱ��ǰ�����ߴ���ʾ -1  
	    calendarNew.add(Calendar.HOUR, -5);  
	    System.out.println("ʱ��Ƚϣ�" + calendarNew.compareTo(calendar));  
	  
	    // �趨7Сʱ�Ժ�ǰ�ߴ���ʾ 1  
	    calendarNew.add(Calendar.HOUR, +7);  
	    System.out.println("ʱ��Ƚϣ�" + calendarNew.compareTo(calendar));  
	  
	    // �˻� 2 Сʱ��ʱ����ͬ����ʾ 0  
	    calendarNew.add(Calendar.HOUR, -2);  
	    System.out.println("ʱ��Ƚϣ�" + calendarNew.compareTo(calendar));  
	  } 
	
	
	/**
	 * ����ʱ���
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
			System.out.println(day+"��"+hour+"Сʱ"+min+"��"+s+"��");
			
			long ten=10*60*1000;
			if(t>ten){
				System.out.println("����10����!");
			}else{
				System.out.println("С��10���ӣ�");
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
