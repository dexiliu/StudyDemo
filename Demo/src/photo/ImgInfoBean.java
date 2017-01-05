package photo;

public class ImgInfoBean {

	private String imgHeight;
	private String imgWidth;
	private String dateTime;
	private String altitude;//����
	private String latitude;//γ��
	private String longitude;//����
	private Long imgSize;
	private String imgName;
	public String getImgHeight() {
		return imgHeight;
	}
	public void setImgHeight(String imgHeight) {
		this.imgHeight = imgHeight;
	}
	public String getImgWidth() {
		return imgWidth;
	}
	public void setImgWidth(String imgWidth) {
		this.imgWidth = imgWidth;
	}
	public String getDateTime() {
		return dateTime;
	}
	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}
	public String getAltitude() {
		return altitude;
	}
	public void setAltitude(String altitude) {
		this.altitude = altitude;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public Long getImgSize() {
		return imgSize;
	}
	public void setImgSize(Long imgSize) {
		this.imgSize = imgSize;
	}
	public String getImgName() {
		return imgName;
	}
	public void setImgName(String imgName) {
		this.imgName = imgName;
	}
	
	public String toString(){
		return "[ͼƬ��Ϣ]�ļ����ƣ�"+this.imgName+"���ļ���С��"+this.imgSize
				+"���߶ȣ�"+this.imgHeight+"����ȣ�"+this.imgWidth+"������ʱ�䣺"
				+this.dateTime+"�����Σ�"+this.altitude+"��γ�ȣ�"+this.latitude
				+"�����ȣ�"+this.longitude;
	}
	
}
