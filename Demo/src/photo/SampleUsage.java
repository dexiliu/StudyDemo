/*package photo;

import java.io.File;
import java.io.IOException;

import com.drew.imaging.ImageMetadataReader;
import com.drew.imaging.ImageProcessingException;
import com.drew.metadata.Directory;
import com.drew.metadata.Metadata;
import com.drew.metadata.Tag;

public class SampleUsage {

	public ImgInfoBean parseImgInfo(String fileName){
		File file = new File(fileName);
		ImgInfoBean imgInfoBean = null;
		try{
			Metadata metadata = ImageMetadataReader.readMetadata(file);
			imgInfoBean = printImageTags(file,metadata);
		}catch(ImageProcessingException e){
			System.err.println("error 1a:"+e);
		}catch (IOException e) {
			System.err.println("error 1b:"+e);
		}
		return imgInfoBean;
	}

	*//**
	 * ��ȡmetadata�������Ϣ
	 * @param sourceFile Դ�ļ�
	 * @param metadata Ԫ������Ϣ
	 * @return
	 *//*
	private ImgInfoBean printImageTags(File sourceFile, Metadata metadata) {
		ImgInfoBean imgInfoBean = new ImgInfoBean();
		imgInfoBean.setImgSize(sourceFile.getTotalSpace());
		imgInfoBean.setImgName(sourceFile.getName());
		for(Directory directory:metadata.getDirectories()){
			for(Tag tag:directory.getTags()){
				String tagName = tag.getTagName();
				String desc = tag.getDescription();
				if(tagName.equals("Image Height")){
					imgInfoBean.setImgHeight(desc);
				}else if(tagName.equals("Image Width")){
					imgInfoBean.setImgWidth(desc);
				}else if(tagName.equals("Date/Time Original")){
					imgInfoBean.setDateTime(desc);
				}else if(tagName.equals("GPS Altitude")){
					imgInfoBean.setAltitude(desc);
				}else if(tagName.equals("GPS Latitude")){
					imgInfoBean.setLatitude(desc);
				}else if(tagName.equals("GPS Longitude")){
					imgInfoBean.setLongitude(desc);
				}
			}
			for(String error:directory.getErrors()){
				System.err.println("error:"+error);
			}
		}
		return imgInfoBean;
	}
	
	*//**
	 * ��γ��ת��  �ȷ���ת��
	 * @param point �����
	 * @return
	 *//*
	public String pointTolatlong(String point){
		Double du = Double.parseDouble(point.substring(0,point.indexOf("��")).trim());
		Double fen = Double.parseDouble(point.substring(point.indexOf("��")+1, point.indexOf("'")).trim());
		Double miao = Double.parseDouble(point.substring(point.indexOf("'")+1, point.indexOf("\"")).trim());
		Double duStr = du + fen/60 + miao/60/60;
		return duStr.toString();
	}
	
	public static void main(String[] args){
		SampleUsage sampleUsage = new SampleUsage();
		ImgInfoBean imgInfoBean = sampleUsage.parseImgInfo("D:\\12.jpg");
		System.out.println(imgInfoBean.toString());
		
	}
}
*/