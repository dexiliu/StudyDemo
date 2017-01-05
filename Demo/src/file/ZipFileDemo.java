package file;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;


/**
 * 解压zip文件
 * @author Administrator
 *
 */
public class ZipFileDemo {

	public static void main(String[] args) throws ZipException, IOException {
		ZipFileDemo demo=new ZipFileDemo();
		String directory="d:/apache-tomcat-7.0.54 - 8090";
//		File file=new File("d:/zngsgw.zip");
		demo.unzip("d:/zngsgw.zip", directory);
	}
	
	@SuppressWarnings("resource")
	public void unzip(String zipFilePath, String targetPath)
			throws IOException {
		OutputStream os = null;
		InputStream is = null;
		ZipFile zipFile = null;
		ZipInputStream zipInputStream = null;
		System.setProperty("sun.zip.encoding", System.getProperty("sun.jnu.encoding"));
		try {
			zipFile = new ZipFile(zipFilePath, Charset.forName("gbk"));//解决文件目录有中文时的解压错误
			String directoryPath = "";
			if (null == targetPath || "".equals(targetPath)) {
				directoryPath = zipFilePath.substring(0,zipFilePath.lastIndexOf("."));
			} else {
				directoryPath = targetPath;
			}
			zipInputStream = new ZipInputStream(new FileInputStream(
					zipFilePath), Charset.forName("gbk"));//解决文件目录有中文时的解压错误
			if (null != zipInputStream) {
				ZipEntry zipEntry=null;
				while ((zipEntry=zipInputStream.getNextEntry())!=null) {
					if (zipEntry.getSize() > 0) {
						// 文件
						File targetFile = buildFile(directoryPath + File.separator + zipEntry.getName(), false);
						os = new BufferedOutputStream(new FileOutputStream(targetFile));
						is = zipFile.getInputStream(zipEntry);
						byte[] buffer = new byte[4096];
						int readLen = 0;
						while ((readLen = is.read(buffer, 0, 4096)) >= 0) {
							os.write(buffer, 0, readLen);
						}
						os.flush();
					} else {
						// 空目录
						buildFile(directoryPath + File.separator + zipEntry.getName(), true);
					}
				}
			}
		} catch (IOException ex) {
			throw ex;
		} finally {
			if(null != zipInputStream){
				zipInputStream.close();
				zipInputStream=null;
			}
			if (null != is) {
				is.close();
				is=null;
			}
			if (null != os) {
				os.close();
				os=null;
			}
		}
		System.out.println("解压完成！");
	}

	public File buildFile(String fileName, boolean isDirectory) {
		File target = new File(fileName);
		if (isDirectory) {
			target.mkdirs();
		} else {
			if (!target.getParentFile().exists()) {
				target.getParentFile().mkdirs();
				target = new File(target.getAbsolutePath());
			}
		}
		return target;
	}
}
