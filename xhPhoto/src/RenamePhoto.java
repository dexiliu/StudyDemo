import java.io.File;
import java.util.ArrayList;

/**
 * ��������Ƭ����������Ƭ���Ʊ�����ѧ�������������ַ�
 * @author Administrator
 *
 */

public class RenamePhoto {

	final static String excel = PropertiesUtil.getInstance().getParam("excel");//����·��
	final static String src = PropertiesUtil.getInstance().getParam("allPhoto");//��Ƭ��Դ·��
	
	public static void main(String[] args) {
		ArrayList<ArrayList<String>> arrList=ExcelUtil.readExcel(excel);//��ȡexcel������ѧ�����������磺[xxx,xxx][xxx,xxx]
		File[] files=getFileName(src);
		
		for(ArrayList<String> list:arrList){//ѭ�����ӹ�����
			list.remove(0);
			for(int i=0;i<list.size();i++){//ѭ��excel��������������С
				for(int j=0;j<files.length;j++){//��Ƭ��������С
					String name=files[j].toString();
					if(name.indexOf(list.get(i))>0){
						files[j].renameTo(new File(files[j].getParent()+File.separator+list.get(i)+".jpg"));
					}
				}
			}
		}
	}
	
	public static File[] getFileName(String src){
		File file=new File(src);
		File[] files=file.listFiles();
		return files;
	}

}
