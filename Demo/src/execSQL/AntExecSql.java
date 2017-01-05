package execSQL;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.SQLExec;
import org.apache.tools.ant.types.EnumeratedAttribute;

/**
 * 调用 ant.jar 的 SQLExec 执行 SQL 脚本文件
 * 
 */
public class AntExecSql {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SQLExec sqlExec = new SQLExec();
		Date date=new Date();
		SimpleDateFormat time=new SimpleDateFormat("HH:mm:ss");
		System.out.println(time.format(date));
		// 设置数据库参数
		sqlExec.setDriver("com.mysql.jdbc.Driver");
		sqlExec.setUrl("jdbc:mysql://127.0.0.1:3306/gdyjyx01?useUnicode=true&characterEncoding=UTF-8");
		sqlExec.setUserid("root");
		sqlExec.setPassword("root");
		// 要执行的脚本
		sqlExec.setSrc(new File("d:/school-v2.14.sql"));
		// 有出错的语句该如何处理
		sqlExec.setOnerror((SQLExec.OnError) (EnumeratedAttribute.getInstance(
				SQLExec.OnError.class, "abort")));
		sqlExec.setPrint(true); // 设置是否输出
		// 输出到文件 sql.out 中；不设置该属性，默认输出到控制台
//		sqlExec.setOutput(new File("src/sql.out"));
		sqlExec.setProject(new Project()); // 要指定这个属性，不然会出错
		sqlExec.execute();
		System.out.println("sql执行成功！");
		Date date1=new Date();
		System.out.println(time.format(date1));
		long d=date1.getTime()-date.getTime();
		System.out.println(d+"ms");
	}
}
