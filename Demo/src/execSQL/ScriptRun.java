package execSQL;


import java.io.IOException;

import com.ibatis.common.resources.Resources;
import com.ibatis.db.util.ScriptRunner;


public class ScriptRun {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException, Exception {
		ScriptRunner runner=new ScriptRunner("com.mysql.jdbc.Driver","jdbc:mysql://127.0.0.1:3306/gdyjyx01?useUnicode=true&characterEncoding=UTF-8","root","root");
		runner.setAutoCommit(false);
		runner.setErrorLogWriter(null);
		runner.setLogWriter(null);
		runner.runScript(Resources.getResourceAsReader("execSQL/school-v2.14.sql"));
		System.out.println("finish");
	}

}
