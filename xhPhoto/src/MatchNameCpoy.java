

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

public class MatchNameCpoy {

	public static void main(String[] args) throws IOException {
		String src = PropertiesUtil.getInstance().getParam("allPhoto");//��Ƭ��Դ·��
		String dest = PropertiesUtil.getInstance().getParam("findPhoto");
		String excel = PropertiesUtil.getInstance().getParam("excel");//����·��
		String sign = PropertiesUtil.getInstance().getParam("sign");//��ȡ���ҵ����ͣ���ȷ��ģ������
		String type = PropertiesUtil.getInstance().getParam("type");//�������ͣ����ƻ��Ǽ���
		
		String msg="��Ƭ�Ѹ�����ɣ�";
		int success=0;//���Ƴɹ�������
		int fail=0;//����ʧ�ܵ�����
		long l=System.currentTimeMillis();
		ArrayList<ArrayList<String>> arrList=ExcelUtil.readExcel(excel);//��ȡexcel������ѧ�����������磺[xxx,xxx][xxx,xxx]
		ArrayList<Map<String,String>> listMap=PhotoUtil.getMap(src);//��ȡ��Ƭ�����ƺʹ��·����map
		for(ArrayList<String> list:arrList){//ѭ�����ӹ�����
			String des=dest+File.separator+list.get(0);
			list.remove(0);
			File file=new File(des);
			if(!file.exists())//һ���ӹ��������ѧ����Ƭ���Ʊ�����һ���ļ�����
				file.mkdirs();
			for(int i=0;i<list.size();i++){//ѭ��excel��������������С
				boolean flag=false;//���Ƴɹ���ʧ�ܵı�־�����Ƴɹ���Ϊtrue
				for(int j=0;j<listMap.size();j++){//��Ƭ��������С
					String name=(String)listMap.get(j).get("name");//��ȡmap�ﱣ����Ƭ������
					if(sign.equals("0")){//ģ������
						if(name.indexOf(list.get(i))!=-1){
							String path=(String)listMap.get(j).get("path");//��ȡmap�ﱣ����Ƭ��·��
							PhotoUtil.copy(path, file.toString()+File.separator+name);//������Ƭ
							if("0".equals(type)){
								PhotoUtil.delFile(path);
								msg="��Ƭ���гɹ���";
							}
							flag=true;
						}
					}
					if(sign.equals("1")){//��ȷ����
						if(name.equals(list.get(i))){
							String path=(String)listMap.get(j).get("path");//��ȡmap�ﱣ����Ƭ��·��
							PhotoUtil.copy(path, file.toString()+File.separator+name);//������Ƭ
							if("0".equals(type)){
								PhotoUtil.delFile(path);
								msg="��Ƭ���гɹ���";
							}
							flag=true;
						}
					}
				}
				
				if(!flag){
					System.err.println(list.get(i)+"����Ƭ�����ڣ�");
					fail++;
				}else{
					System.out.println(list.get(i)+"��"+msg);
					success++;
				}
			}
		}
		
		System.err.println("\n ������ɣ���ʱ"+(System.currentTimeMillis()-l)+"����,�ɹ�"+success+",ʧ��"+fail);
	}
}
