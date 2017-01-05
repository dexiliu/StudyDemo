package photo;

public class ImgInfoBean {

	private String imgHeight;
	private String imgWidth;
	private String dateTime;
	private String altitude;//海拔
	private String latitude;//纬度
	private String longitude;//经度
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
		return "[图片信息]文件名称："+this.imgName+"，文件大小："+this.imgSize
				+"，高度："+this.imgHeight+"，宽度："+this.imgWidth+"，拍摄时间："
				+this.dateTime+"，海拔："+this.altitude+"，纬度："+this.latitude
				+"，经度："+this.longitude;
	}
	
}
