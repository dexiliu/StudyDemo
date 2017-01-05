package file;

import java.io.*;

public class OperateSQLfile implements AutoCloseable{

	public static void main(String[] args){
			try(FileOutputStream out=new FileOutputStream(new File("d:/sql.sql"),true);){
				out.write("use db;".getBytes("utf-8"));
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("over!");
		
	}

	@Override
	public void close() throws Exception {
		
	}

}
