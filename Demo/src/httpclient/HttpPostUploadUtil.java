package httpclient;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.activation.MimetypesFileTypeMap;

public class HttpPostUploadUtil {

	public static void main(String[] args) {
		String filepath1="D:\\2016\\111.jpg";
		String filepath2="D:\\2016\\1.jpg";
		String filepath3="D:\\2016\\sql.txt";
		String urlStr="http://192.168.4.147:8080/zngsgw/news.do?upload2";
		Map<String,String> textMap=new HashMap<String, String>();
		textMap.put("names", "test");
		Map<String,String> fileMap=new HashMap<>();
		fileMap.put("userfile1", filepath1);
		fileMap.put("userfile2", filepath2);
		fileMap.put("userfile3", filepath3);
		String ret=formUpload(urlStr,textMap,fileMap);
		System.out.println(ret);
	}

	/**
	 * 上传图片
	 * @param urlStr 上传路径
	 * @param textMap 上传的参数
	 * @param fileMap 上传的图片路径
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static String formUpload(String urlStr,Map<String,String> textMap,Map<String,String> fileMap){
		String res="";
		HttpURLConnection conn = null;
		String BOUNDARY = "----------123821742118716";//boundary就是request头和上传文件内容的分隔符  
		try{
			URL url = new URL(urlStr);
			conn = (HttpURLConnection)url.openConnection();
			conn.setConnectTimeout(5000);
			conn.setReadTimeout(30000);
			conn.setDoOutput(true);
			conn.setDoInput(true);
			conn.setUseCaches(false);
			conn.setRequestMethod("POST");
			conn.setRequestProperty("Connection", "Kepp-Alive");
			conn.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows; U; Windows NT 6.1; zh-CN; rv:1.9.2.6)");
			conn.setRequestProperty("Content-Type", "multipart/form-data; boundary=" + BOUNDARY);
			OutputStream out = new DataOutputStream(conn.getOutputStream());
			//text
			if(null!=textMap){
				StringBuffer strBuf = new StringBuffer();
				Iterator iter = textMap.entrySet().iterator();
				while(iter.hasNext()){
					Map.Entry entry = (Map.Entry)iter.next();
					String inputName = (String)entry.getKey();
					String inputValue = (String)entry.getValue();
					if(inputValue == null){
						continue;
					}
					strBuf.append("\r\n").append("--").append(BOUNDARY).append("\r\n");
					strBuf.append("Content-Disposition:form-data;name=\""+inputName+"\"\r\n\r\n");
					strBuf.append(inputValue);
				}
				out.write(strBuf.toString().getBytes());
			}
			
			//file
			if(null!=fileMap){
				Iterator iter = fileMap.entrySet().iterator();
				while(iter.hasNext()){
					Map.Entry entry = (Map.Entry)iter.next();
					String inputName = (String)entry.getKey();
					String inputValue = (String)entry.getValue();
					if(inputValue==null){
						continue;
					}
					File file = new File(inputValue);
					String filename = file.getName();
					String contentType = new MimetypesFileTypeMap().getContentType(file);
					if(filename.endsWith(".jpg")){
						contentType = "image/jpg";
					}
					if(contentType == null || contentType.equals("")){
						contentType = "application.octet-stream";
					}
					
					StringBuffer strBuf = new StringBuffer();
					strBuf.append("\r\n").append("--").append(BOUNDARY).append("\r\n");
					strBuf.append("Content-Disposition:form-data;name=\""+inputName+"\";filename=\""+filename+"\"\r\n");
					strBuf.append("Content-Type:"+contentType+"\r\n\r\n");
					out.write(strBuf.toString().getBytes());
					DataInputStream in = new DataInputStream(new FileInputStream(file));
					int bytes=0;
					byte[] bufferOut=new byte[1024];
					while((bytes=in.read(bufferOut))!=-1){
						out.write(bufferOut, 0, bytes);
					}
					in.close();
				}
			}
			
			byte[] endData=("\r\n--"+BOUNDARY+"--\r\n").getBytes();
			out.write(endData);
			out.flush();
			out.close();
			
			//读取返回数据
			StringBuffer strBuf = new StringBuffer();
			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line=null;
			while((line=reader.readLine())!=null){
				strBuf.append(line).append("\n");
			}
			res=strBuf.toString();
			System.out.println("res=========="+res);
			reader.close();
			reader=null;
				
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(conn!=null){
				conn.disconnect();
				conn=null;
			}
		}
		return res;
	}
	
	public static void post(){
	}
}
