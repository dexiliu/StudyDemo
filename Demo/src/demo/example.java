package demo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class example {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		try {
			RandomAccessFile raf = new RandomAccessFile("src/code/DataSourceType.java","rw");
			byte[] b = new byte[1024];
			b = "    ,DS_ljyz//龙颈一中\r\n }".getBytes();
			long l = raf.length();
			raf.seek(l-2);
			raf.write(b);
			System.out.println(raf.length());
			raf.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Map<String,String> map = new HashMap<>();
		map.put("a", "aaa");
		map.put("b", "bbb");
		String c="c";
		Set<String> ss = map.keySet();
		System.out.println(ss.contains(c));
	}	
	
	public static double numberWithPrecision(double value, int precision) {
        double temp = Math.pow(10, precision);
        return ((int) Math.round(temp * value)) / temp;
    }
	
}
