package excel;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class getData {

	private static String str = "fighting";
	private static Pattern p;
	private static Matcher m;

	public static void getNum(String str) {
		String s="";
		String regEx = "[\\u4e00-\\u9fa5]";
		p = Pattern.compile(regEx);
		m = p.matcher(str);
		while (m.find())
		{
			s+=m.group();
		}
		System.out.println("======="+s);
	}
	
	public static void main(String[] args) {
		getNum(str);
		System.out.println("==========");
	}
}
