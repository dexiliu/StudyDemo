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
	 * �ļ�����
	 */
	public void fileDownload() {
		// �������Դ�ļ��������Ǵ��ڵ�
		File beforefile = new File("d:/zngsgw.zip");

		// ������Ҫ����֮����ļ������Զ���ģ���������
		File afterfile = new File(
				"d:/apache-tomcat-7.0.54 - 8090/webapps/zngsgw.zip");
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			// �����ļ���������������ȡbeforefile�ļ�
			fis = new FileInputStream(beforefile);

			// �����ļ����������������Ϣд��afterfile�ļ���
			fos = new FileOutputStream(afterfile);

			// �ļ�������
			byte[] b = new byte[1024];
			// ���ļ�����Ϣ��ȡ�ļ��������������ȡ�����Ϊ-1�ʹ����ļ�û�ж�ȡ��ϣ���֮�Ѿ���ȡ���
			while (fis.read(b) != -1) {
				// ���������е�����д��afterfile�ļ���
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
		System.out.println("������ɣ�");
	}

	/**
	 * ��ѹ�ļ�
	 * 
	 * @param zipFilePath
	 *            ��Ҫ ��ѹ�ļ�·��
	 * @param targetPath
	 *            ��ѹ����·��
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
						// �ļ�
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
						// ��Ŀ¼
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
		System.out.println("��ѹ��ɣ�");
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
