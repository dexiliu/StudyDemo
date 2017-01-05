package photo;

import java.io.File;
import java.io.IOException;
import java.security.MessageDigest;

import com.drew.imaging.ImageProcessingException;
import com.drew.imaging.jpeg.JpegMetadataReader;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;



public class ReadPhotoMsg {

	public static void main(String[] args) {
		System.out.println(MD5("123456"));
		
	}
	
	public static void getPhotoMsg(String path){
		File file=new File(path);
		System.out.println("文件名称="+file.getName());
		Metadata metadata;
		try {
			metadata = JpegMetadataReader.readMetadata(file);
			for(Directory directory:metadata.getDirectories()){
				for(Tag tag:directory.getTags()){
					System.out.format("[%s]-%s=%s", directory.getName(),tag.getTagName(),tag.getDescription());
					System.out.println("\n");
				}
				if(directory.hasErrors()){
					for(String error:directory.getErrors()){
						System.err.format("ERROR:%s", error);
					}
				}
			}
		} catch (ImageProcessingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String MD5(String str){
		String result = null;
		try{
			MessageDigest md = MessageDigest.getInstance("MD5");
			byte[] b = str.getBytes();
			md.update(b);
			byte[] br = md.digest();
			StringBuffer sb = new StringBuffer();
			for(byte by : br){
				int bt = by&0xff;
				if(bt<16){
					sb.append(0);
				}
				sb.append(Integer.toHexString(bt));
			}
			result = sb.toString();
		}catch(Exception e){
			e.printStackTrace();
		}
		return result;
	}

}
