package code;

public class IterateEnum {

	public static void main(String[] args) {
		DataSourceType[] d=DataSourceType.values();
		String dataSourceTypes = "";
		for(DataSourceType dst:d){
			dataSourceTypes += dst.toString() + ",";
		}
		System.out.println(dataSourceTypes);
		if(dataSourceTypes.contains("DS_yxyz")){
			System.out.println("DS_yxfx");
		}
		try{
			DataSourceType.valueOf("DS_fdh");
			System.out.println(true);
		}catch(Exception e){
			System.out.println(false);
		}
	}

}
