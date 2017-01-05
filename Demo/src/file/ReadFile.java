package file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

	public static void main(String[] args) {
		readSQL("d:/school.txt");
	}

	public static void readSQL(String path){
		File file = new File(path);
		List<String> list=new ArrayList<>();
		String line=null;
		
		try {
			BufferedReader reader=new BufferedReader(new InputStreamReader(new FileInputStream(file),"utf-8"));
			while((line=reader.readLine())!=null){
				list.add(line);
				System.out.println("line="+line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
