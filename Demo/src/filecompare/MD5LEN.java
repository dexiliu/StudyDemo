package filecompare;

import java.io.*;
import java.math.BigInteger;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 比较两个文件，先比较长度，若长度相同，则再比较文件的MD5码
 * @author Administrator
 *
 */

public class MD5LEN {

	public static void main(String[] args) throws IOException {
//		String srcFile="d:/gdyjyx01.sql";
//		String targetFile="e:/gdyjyx01.sql";
//		compare(srcFile,targetFile);
		strList("d:/zngsgw.sql","d:/zngsgw.sql");
	}

	public static void compare(String srcFile, String targetFile) throws FileNotFoundException {
		File src = new File(srcFile);
		File target = new File(targetFile);
		long size_of_src;
		long size_of_target;

		size_of_src = src.length();
		size_of_target = target.length();
		System.out.println("size_of_src="+size_of_src);
		System.out.println("size_of_target="+size_of_target);
		if (size_of_src == size_of_target) {
			System.out.println("文件长度相同！");
			String src_result=getMd5ByFile(src);
			String target_result=getMd5ByFile(target);
			System.out.println("src_result="+src_result);
			System.out.println("target_result="+target_result);
			boolean result=isSame(src_result, target_result);
			if(result){
				System.out.println("文件内容相同！");
			}else{
				System.out.println("文件内容不相同！");
			}
		} else {
			System.out.println("文件长度不相同！");
		}
	}
	
	public static void strList(String srcFile, String targetFile) throws IOException{
		File src = new File(srcFile);
		File target = new File(targetFile);
		List<String> src_list=new ArrayList<>();
		List<String> target_list=new ArrayList<>();
		try {
			BufferedReader src_reader=new BufferedReader(new InputStreamReader(new FileInputStream(src)));
			BufferedReader target_reader=new BufferedReader(new InputStreamReader(new FileInputStream(target)));
			String src_str=null;
			String target_str=null;
			
			Date date=new Date();
			SimpleDateFormat time=new SimpleDateFormat("HH:mm:ss");
			System.out.println(time.format(date));
			while((target_str=target_reader.readLine())!=null){
				target_list.add(target_str);
			}
			System.out.println("target_list.size="+target_list.size());
			while((src_str=src_reader.readLine())!=null){
				if(string_list(src_str,target_list)==true){
					src_list.add(src_str);
				}
			}
			System.out.println("size="+src_list.size());
			Date date1=new Date();
			System.out.println(time.format(date1));
			long d=date1.getTime()-date.getTime();
			System.out.println(d+"ms");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 判断某个字符串是否存在于一个字符串集中,存在则返回true
	 * @param str
	 * @param list
	 * @return
	 */
	public static boolean string_list(String str,List<String> list){
		boolean flag=false;
		for(String str1:list){
			if(!str.equals(str1)){
				continue;
			}else{
				flag=true;
				break;
			}
		}
		return flag;
	}
	
	/**
	 * 获取文件的MD5码
	 * @param file
	 * @return
	 * @throws FileNotFoundException
	 */
	public static String getMd5ByFile(File file) throws FileNotFoundException {
		String value = null;
		FileInputStream in = new FileInputStream(file);
		try {
			MappedByteBuffer byteBuffer = in.getChannel().map(
					FileChannel.MapMode.READ_ONLY, 0, file.length());
			MessageDigest md5 = MessageDigest.getInstance("MD5");
			md5.update(byteBuffer);
			BigInteger bi = new BigInteger(1, md5.digest());
			value = bi.toString(16);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (null != in) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return value;
	}

	public static boolean isSame(String result_source, String result_target) {
		if (result_source == null || result_target == null) {
			return false;
		}
		return (result_source.split("[ \t]")[0].equals(result_target
				.split("[ \t]")[0]));
	}
}
