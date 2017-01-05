//package execSQL;
//
//import java.sql.DriverManager;
//import java.util.Properties;
//import com.ibatis.common.jdbc.ScriptRunner;
//import com.ibatis.common.resources.Resources;
//import com.mysql.jdbc.Connection;
//
//public class ibatisExec {
//	 public static void main(String[] args) {
//		  
//		  try {
//		   Properties props = Resources.getResourceAsProperties("properties/database.properties");
//		   String url = props.getProperty("url");
//		   String driver = props.getProperty("driver");
//		   String username = props.getProperty("username");
//		   String password = props.getProperty("password");
//		   System.out.println(url);
//		   if(url.equals("jdbc:mysql://localhost:3306/jpetstore1")) {
//		    Class.forName(driver).newInstance();
//		    Connection conn = (Connection) DriverManager.getConnection(url, username, password);
//		    ScriptRunner runner = new ScriptRunner(conn, false, false);
//		    runner.setErrorLogWriter(null);
//		    runner.setLogWriter(null);
//		    runner.runScript(Resources.getResourceAsReader("ddl/mysql/jpetstore-mysql-schema.sql"));
//		    runner.runScript(Resources.getResourceAsReader("ddl/mysql/jpetstore-mysql-dataload.sql"));
//		    
//		   }
//		   
//		  } catch (Exception e) {
//		   e.printStackTrace();
//		  }
//		  
//		 }
//}
