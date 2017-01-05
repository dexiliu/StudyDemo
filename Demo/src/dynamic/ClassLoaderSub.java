package dynamic;

import java.io.File;
import java.io.FileInputStream;

@SuppressWarnings({ "rawtypes", "finally" })
public class ClassLoaderSub extends ClassLoader {
	
	public Class getClassByFile(String fileName) throws Exception{
		File classFile = new File(fileName);
		byte[] bytes = new byte[10240000];
		FileInputStream fis = null;
		Class clazz = null;
		try{
			fis = new FileInputStream(classFile);
			int j = 0;
			while(true){
				int i = fis.read(bytes);
				if(i == -1){
					break;
				}
				j += i;
			}
			clazz = defineClassByName(null,bytes,0,j);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			fis.close();
			return clazz;
		}
	}

	private Class defineClassByName(String name, byte[] bytes, int off, int len) {
		Class clazz = super.defineClass(name, bytes, off, len);
		return clazz;
	}
}
