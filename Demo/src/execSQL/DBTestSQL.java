package execSQL;

import java.io.IOException;
import java.sql.DriverManager;

import com.ibatis.common.jdbc.ScriptRunner;
import com.ibatis.common.resources.Resources;
import com.mysql.jdbc.Connection;

public class DBTestSQL {

	public static void main(String[] args) throws IOException{

		try {
			String url = "jdbc:mysql://127.0.0.1:3306/gdyjyx01";
			String driver = "com.mysql.jdbc.Driver";
			String username = "root";
			String password = "root";
			if (url.equals("jdbc:mysql://127.0.0.1:3306/gdyjyx01")) {
				Class.forName(driver).newInstance();  
			    Connection conn = (Connection) DriverManager.getConnection(url, username, password); 
				ScriptRunner runner = new ScriptRunner(conn,false,false);
				runner.setErrorLogWriter(null);
				runner.setLogWriter(null);
				runner.runScript(Resources
						.getResourceAsReader("execSQL/school-v2.14.sql"));
			}
			System.out.println("finish");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
