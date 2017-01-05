package demo;

import java.io.File;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.multipart.FilePart;
import org.apache.commons.httpclient.methods.multipart.MultipartRequestEntity;
import org.apache.commons.httpclient.methods.multipart.Part;

public class Hclient {
	public static void main(String args[]) {
		String targetURL = null;// TODO ָ��URL
		File targetFile = null;// TODO ָ���ϴ��ļ�

		targetFile = new File("d:/school-v2.14.zip");
		targetURL = "http://192.168.2.122:8090/zngsgw/news.do?upload2"; // servleturl
		PostMethod filePost = new PostMethod(targetURL);

		try {

			// ͨ�����·�������ģ��ҳ������ύ
			// filePost.setParameter("name", "����");
			// filePost.setParameter("pass", "1234");

			Part[] parts = { new FilePart(targetFile.getName(), targetFile) };
			filePost.setRequestEntity(new MultipartRequestEntity(parts,
					filePost.getParams()));
			HttpClient client = new HttpClient();
			client.getHttpConnectionManager().getParams()
					.setConnectionTimeout(5000);
			int status = client.executeMethod(filePost);
			if (status == HttpStatus.SC_OK) {
				System.out.println("�ϴ��ɹ�");
				// �ϴ��ɹ�
			} else {
				System.out.println("�ϴ�ʧ��");
				// �ϴ�ʧ��
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			filePost.releaseConnection();
		}
	}
}