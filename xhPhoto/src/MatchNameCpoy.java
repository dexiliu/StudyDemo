

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class MatchNameCpoy {

	public static void main(String[] args) throws IOException {
		String src = PropertiesUtil.getInstance().getParam("allPhoto");//照片的源路径
		String dest = PropertiesUtil.getInstance().getParam("findPhoto");
		String excel = PropertiesUtil.getInstance().getParam("excel");//表格的路径
		String sign = PropertiesUtil.getInstance().getParam("sign");//获取查找的类型，精确或模糊查找
		String type = PropertiesUtil.getInstance().getParam("type");//操作类型，复制还是剪切
		
		String msg="照片已复制完成！";
		int success=0;//复制成功的数量
		int fail=0;//复制失败的数量
		long l=System.currentTimeMillis();
		ArrayList<ArrayList<String>> arrList=ExcelUtil.readExcel(excel);//获取excel表格里的学生姓名，例如：[xxx,xxx][xxx,xxx]
		ArrayList<Map<String,String>> listMap=PhotoUtil.getMap(src);//获取照片的名称和存放路径的map
		for(ArrayList<String> list:arrList){//循环各子工作表
			String des=dest+File.separator+list.get(0);
			list.remove(0);
			File file=new File(des);
			if(!file.exists())//一个子工作表里的学生照片复制保存在一个文件夹里
				file.mkdirs();
			for(int i=0;i<list.size();i++){//循环excel表格里的行数量大小
				boolean flag=false;//复制成功、失败的标志；复制成功改为true
				for(int j=0;j<listMap.size();j++){//照片的数量大小
					String name=(String)listMap.get(j).get("name");//获取map里保存照片的名称
					if(sign.equals("0")){//模糊查找
						if(name.indexOf(list.get(i))!=-1){
							String path=(String)listMap.get(j).get("path");//获取map里保存照片的路径
							PhotoUtil.copy(path, file.toString()+File.separator+name);//复制照片
							if("0".equals(type)){
								PhotoUtil.delFile(path);
								msg="照片剪切成功！";
							}
							flag=true;
						}
					}
					if(sign.equals("1")){//精确查找
						if(name.equals(list.get(i))){
							String path=(String)listMap.get(j).get("path");//获取map里保存照片的路径
							PhotoUtil.copy(path, file.toString()+File.separator+name);//复制照片
							if("0".equals(type)){
								PhotoUtil.delFile(path);
								msg="照片剪切成功！";
							}
							flag=true;
						}
					}
				}
				
				if(!flag){
					System.err.println(list.get(i)+"，照片不存在！");
					fail++;
				}else{
					System.out.println(list.get(i)+"，"+msg);
					success++;
				}
			}
		}
		
		System.err.println("\n 复制完成！用时"+(System.currentTimeMillis()-l)+"毫秒,成功"+success+",失败"+fail);
	}
}
