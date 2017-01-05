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

public class filedownload {

	@SuppressWarnings("static-access")
	public static void main(String[] args) throws ZipException, IOException {
		filedownload file = new filedownload();
		file.fileDownload();
		file.unzip("d:/apache-tomcat-7.0.54 - 8090/webapps/zngsgw.zip",
				"d:/apache-tomcat-7.0.54 - 8090/webapps/");
	}

	/**
	 * 文件下载
	 */
	public void fileDownload() {
		// 这是你的源文件，本身是存在的
		File beforefile = new File("d:/zngsgw.zip");

		// 这是你要保存之后的文件，是自定义的，本身不存在
		File afterfile = new File(
				"d:/apache-tomcat-7.0.54 - 8090/webapps/zngsgw.zip");
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			// 定义文件输入流，用来读取beforefile文件
			fis = new FileInputStream(beforefile);

			// 定义文件输出流，用来把信息写入afterfile文件中
			fos = new FileOutputStream(afterfile);

			// 文件缓存区
			byte[] b = new byte[1024];
			// 将文件流信息读取文件缓存区，如果读取结果不为-1就代表文件没有读取完毕，反之已经读取完毕
			while (fis.read(b) != -1) {
				// 将缓存区中的内容写到afterfile文件中
				fos.write(b);
				fos.flush();
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("下载完成！");
	}

	/**
	 * 解压文件
	 * 
	 * @param zipFilePath
	 *            需要 解压文件路径
	 * @param targetPath
	 *            解压到的路径
	 * @throws IOException
	 */
	@SuppressWarnings("resource")
	public static void unzip(String zipFilePath, String targetPath)
			throws IOException {
		OutputStream os = null;
		InputStream is = null;
		ZipFile zipFile = null;
		try {
			zipFile = new ZipFile(zipFilePath);
			String directoryPath = "";
			if (null == targetPath || "".equals(targetPath)) {
				directoryPath = zipFilePath.substring(0,
						zipFilePath.lastIndexOf("."));
			} else {
				directoryPath = targetPath;
			}
			ZipInputStream zipInputStream = new ZipInputStream(
					new FileInputStream(zipFilePath), Charset.forName("utf-8"));
			if (null != zipInputStream) {
				ZipEntry zipEntry = null;
				while ((zipEntry = zipInputStream.getNextEntry()) != null) {
					if (zipEntry.getSize() > 0) {
						// 文件
						File targetFile = buildFile(directoryPath
								+ File.separator + zipEntry.getName(), false);
						os = new BufferedOutputStream(new FileOutputStream(
								targetFile));
						is = zipFile.getInputStream(zipEntry);
						byte[] buffer = new byte[4096];
						int readLen = 0;
						while ((readLen = is.read(buffer, 0, 4096)) >= 0) {
							os.write(buffer, 0, readLen);
						}

						os.flush();
						os.close();
					} else {
						// 空目录
						buildFile(
								directoryPath + File.separator
										+ zipEntry.getName(), true);
					}
				}
			}
		} catch (IOException ex) {
			throw ex;
		} finally {
			if (null != zipFile) {
				zipFile = null;
			}
			if (null != is) {
				is.close();
			}
			if (null != os) {
				os.close();
			}
		}
		System.out.println("解压完成！");
	}

	public static File buildFile(String fileName, boolean isDirectory) {
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
