package demo;

import java.io.DataInputStream;
import java.io.IOException;

public class TestRuntime {

	// startup
	public static void main(String args[]) {
		try {
			// Process p = Runtime.getRuntime().exec("D:\\apache-tomcat-7.0.54 - 8090\\bin\\startup.bat");
			Process p = Runtime.getRuntime().exec("D:\\version\\cmd.bat");
			DataInputStream ls_in = new DataInputStream(p.getInputStream());
			String ls_str;

			try {
				while ((ls_str = ls_in.readLine()) != null) {
					System.out.println(ls_str);
				}
				System.out.println("finish");
			} catch (IOException e) {
				System.exit(0);
			}
		} catch (Exception ex) {
			System.out.println("startup Exception: " + ex);
		}
	}
}
