//package demo;
//
//public class getWeather {
//
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		//���ݹؼ���������ַ����
//	    String url = "http://toy1.weather.com.cn/search";
//	    HttpUtils util = HttpUtils.get(url);
//	    util.addParameter("cityname", "�Ϻ�");
//	    util.addParameter("callback", "");
//	    util.addParameter("_", System.currentTimeMillis()+"");
//	    util.addHeader("Referer", "http://www.weather.com.cn/weather1d/101020100.shtml");
//	     
//	    String ret = util.execute().getString();
//	    if (ret == null || (ret=ret.trim()).equals("")) {
//	        System.out.println("û�в�ѯ����ַ��Ϣ");
//	        return ;
//	    }
//	     
//	    ret = ret.substring(1, ret.length()-1);
//	    Map[] list = HttpUtils.mapper.readValue(ret, Map[].class);
//	    if (list.length == 0) {
//	        System.out.println("û�в�ѯ����ַ��Ϣ");
//	        return ;
//	    }
//	    System.out.println("��ѯ���ĵ�ַ�б�:"  + Arrays.toString(list));
//	     
//	    //��ȡ���д���
//	    String cityCode = list[0].get("ref").toString().substring(0, 9);
//	    url = "http://d1.weather.com.cn/sk_2d/" + cityCode + ".html?_=" + System.currentTimeMillis();
//	     
//	    //��ȡ������Ϣ
//	    HttpUtils reqest = HttpUtils.get(url, util); //���ֻỰ
//	    util.addHeader("Referer", "http://www.weather.com.cn/weather1d/101180101.shtml");
//	    ret = reqest.execute().getString();
//	    System.out.println(ret);
//	    util.shutdown();
//
//	}
//
//}
