package execSQL;

import java.sql.*;


public class JDBCExec {

	public static void main(String[] args) {
		 Connection con = null;
		 Statement stmt = null;
		 
		 try{
			 Class.forName("com.mysql.jdbc.Driver");
			 con = DriverManager.getConnection(
				     "jdbc:mysql://localhost:3306/gdyjyx01", "root", "root");
			 stmt = con.createStatement();
			 StringBuffer sb=new StringBuffer();
			 sb.append("DROP TRIGGER IF EXISTS tb_schooltime_grade_binsert_clouddb");
			 sb.append("CREATE TRIGGER tb_schooltime_grade_binsert_clouddb BEFORE INSERT ON tb_schooltime_grade FOR EACH ROW");
			 sb.append("BEGIN");
			 sb.append("IF NEW.SYN IS NULL THEN");
			 sb.append("SET NEW.SYN = /'2/'");
			 sb.append("UPDATE cloud_syn set UPLOADINSERT = /'1/'");
			 sb.append("WHERE TABLE_NAME = /'tb_schooltime_grade/'");
			 sb.append("END IF;");
			 sb.append("END");
			 
//			 sb.append("insert into tb_version(ID,versions) value(UUID(),'v2.19')");
			 
//			 String s="create table tb_schooltime_grade("+
//			 "id varchar(36) not null primary key,"+
//			 "departid varchar(36),"+
//			 "boarder varchar(1),"+
//			 "hid varchar(36),"+
//			 "wxtype varchar(1),"+
//			 "syn varchar(1))";
//			 
//			 String sql="create table tb_schooltime_grade(" +
//			 		"id varchar(36) not null primary key," +
//			 		"departid varchar(36) DEFAULT NULL," +
//			 		"boarder varchar(1) DEFAULT NULL);";
			 stmt.execute(sb.toString());
			 System.out.println("Ö´ÐÐ³É¹¦");
		}catch(ClassNotFoundException  e){
			e.printStackTrace();
		}catch (SQLException e1) {
			e1.printStackTrace();
		}
	}
	
		 
	 
	 
}
