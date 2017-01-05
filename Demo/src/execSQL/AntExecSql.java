package execSQL;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.tools.ant.Project;
import org.apache.tools.ant.taskdefs.SQLExec;
import org.apache.tools.ant.types.EnumeratedAttribute;

/**
 * ���� ant.jar �� SQLExec ִ�� SQL �ű��ļ�
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
		// �������ݿ����
		sqlExec.setDriver("com.mysql.jdbc.Driver");
		sqlExec.setUrl("jdbc:mysql://127.0.0.1:3306/gdyjyx01?useUnicode=true&characterEncoding=UTF-8");
		sqlExec.setUserid("root");
		sqlExec.setPassword("root");
		// Ҫִ�еĽű�
		sqlExec.setSrc(new File("d:/school-v2.14.sql"));
		// �г����������δ���
		sqlExec.setOnerror((SQLExec.OnError) (EnumeratedAttribute.getInstance(
				SQLExec.OnError.class, "abort")));
		sqlExec.setPrint(true); // �����Ƿ����
		// ������ļ� sql.out �У������ø����ԣ�Ĭ�����������̨
//		sqlExec.setOutput(new File("src/sql.out"));
		sqlExec.setProject(new Project()); // Ҫָ��������ԣ���Ȼ�����
		sqlExec.execute();
		System.out.println("sqlִ�гɹ���");
		Date date1=new Date();
		System.out.println(time.format(date1));
		long d=date1.getTime()-date.getTime();
		System.out.println(d+"ms");
	}
}
