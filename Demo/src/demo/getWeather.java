//package demo;
//
//public class getWeather {
//
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		//根据关键字搜索地址代码
//	    String url = "http://toy1.weather.com.cn/search";
//	    HttpUtils util = HttpUtils.get(url);
//	    util.addParameter("cityname", "上海");
//	    util.addParameter("callback", "");
//	    util.addParameter("_", System.currentTimeMillis()+"");
//	    util.addHeader("Referer", "http://www.weather.com.cn/weather1d/101020100.shtml");
//	     
//	    String ret = util.execute().getString();
//	    if (ret == null || (ret=ret.trim()).equals("")) {
//	        System.out.println("没有查询到地址信息");
//	        return ;
//	    }
//	     
//	    ret = ret.substring(1, ret.length()-1);
//	    Map[] list = HttpUtils.mapper.readValue(ret, Map[].class);
//	    if (list.length == 0) {
//	        System.out.println("没有查询到地址信息");
//	        return ;
//	    }
//	    System.out.println("查询到的地址列表:"  + Arrays.toString(list));
//	     
//	    //获取城市代码
//	    String cityCode = list[0].get("ref").toString().substring(0, 9);
//	    url = "http://d1.weather.com.cn/sk_2d/" + cityCode + ".html?_=" + System.currentTimeMillis();
//	     
//	    //获取天气信息
//	    HttpUtils reqest = HttpUtils.get(url, util); //保持会话
//	    util.addHeader("Referer", "http://www.weather.com.cn/weather1d/101180101.shtml");
//	    ret = reqest.execute().getString();
//	    System.out.println(ret);
//	    util.shutdown();
//
//	}
//
//}
