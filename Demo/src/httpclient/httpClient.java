package httpclient;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class httpClient {

	public static void postForm(){
		//����Ĭ�ϵ�httpClientʵ��
		CloseableHttpClient httpclient=HttpClients.createDefault();
		//����httppost
		HttpPost httppost=new HttpPost("http://192.168.2.122:8080/school/loginController.do?login");
		//上传表单参数
		List<NameValuePair> formparams=new ArrayList<>();
//		formparams.add(new BasicNameValuePair("user","admin"));
//		formparams.add(new BasicNameValuePair("version", "123"));
//		formparams.add(new BasicNameValuePair("date", "date"));
//		formparams.add(new BasicNameValuePair("key", "key"));
//		formparams.add(new BasicNameValuePair("id", "adsf45636"));
//		formparams.add(new BasicNameValuePair("filePath", "adsfasd"));
		formparams.add(new BasicNameValuePair("userName", "18926436017"));
		formparams.add(new BasicNameValuePair("password", "123456"));
		UrlEncodedFormEntity uefEntity;
		try{
			uefEntity=new UrlEncodedFormEntity(formparams,"UTF-8");
			httppost.setEntity(uefEntity);
			System.out.println("executing request uri:"+httppost.getURI());
			CloseableHttpResponse response=httpclient.execute(httppost);
			try{
				HttpEntity entity=response.getEntity();
				if(entity!=null){
					System.out.println("=========================");
					System.out.println("response content:"+EntityUtils.toString(entity,"UTF-8"));
					System.out.println("=========================");
				}else{
					System.out.println("not nothing!");
				}
			}finally{
				response.close();
			}
		}catch(ClientProtocolException e){
			e.printStackTrace();
		}catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally{
			try{
				httpclient.close();
			}catch(IOException e){
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		postForm();
		System.out.println("post");
	}
}
