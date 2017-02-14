package photo;

import java.io.File;

public class Rename {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File("D:\\studentPhotos\\findphotos\\all");
		File[] f = file.listFiles();
		String path = "D:/studentPhotos/findphotos/rename";
		for(int i=0;i<f.length;i++){
			System.out.println(f[i].getName().substring(0, 3));
			File files = new File(path+File.separator+f[i].getName().substring(0, 3).replace("2", "").replace("_", "")+".jpg");
			f[i].renameTo(files);
		}
	}

}
