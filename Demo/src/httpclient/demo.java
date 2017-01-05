package httpclient;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;

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

public class demo {

	public static void postForm(){
		//创建默认的httpClient实例
		CloseableHttpClient httpclient=HttpClients.createDefault();
		//创建httppost
		HttpPost httppost=new HttpPost("http://192.168.2.122:8090/zngsgw/user.do?login");
		//创建参数队列
		List<NameValuePair> formparams=new ArrayList<NameValuePair>();
		formparams.add(new BasicNameValuePair("userName", "admin"));
		formparams.add(new BasicNameValuePair("password", "admin"));
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
	
	/**
	   * 登录验证
	   * @param name 姓名
	   * @param password 密码
	   * @return
	   */
	  public static boolean save(String name, String password){
	    String path = "http://192.168.2.122:8090/zngsgw/user.do?login"; 
	    Map<String, String> student = new HashMap<String, String>();
	    student.put("userName", name);
	    student.put("password", password);
	    try {
	      return SendGETRequest(path, student, "UTF-8");
	    } catch (Exception e) {
	      // TODO Auto-generated catch block
	      e.printStackTrace();
	    }
	    return false;
	  }
	  /**
	   * 发送GET请求
	   * @param path  请求路径
	   * @param student  请求参数
	   * @return 请求是否成功
	   * @throws Exception
	   */
	  private static boolean SendGETRequest(String path, Map<String, String> student, String ecoding) throws Exception{
	    // http://192.168.2.122:8080/school/loginController.do?login
	    StringBuilder url = new StringBuilder(path);
	    url.append("&");
	    for(Map.Entry<String, String> map : student.entrySet()){
	      url.append(map.getKey()).append("=");
	      url.append(URLEncoder.encode(map.getValue(), ecoding));
	      url.append("&");
	    }
	    url.deleteCharAt(url.length()-1);
	    System.out.println(url);
	    HttpsURLConnection conn = (HttpsURLConnection)new URL(url.toString()).openConnection();
	    conn.setConnectTimeout(100000);
	    conn.setRequestMethod("GET");
	    if(conn.getResponseCode() == 200){
	      return true;
	    }
	    return false;
	  }
	
	public static void main(String[] args) {
//		postForm();
		boolean flag=save("admin","admin");
		if(flag){
			System.out.println("post已发出");
		}
		System.out.println("ssssss");
	}
}
