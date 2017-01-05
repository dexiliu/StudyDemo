package socket.demo01;

public class de {

	public static void main(String[] args) {
		String claz = Thread.currentThread().getStackTrace()[1].getClassName().replace(".", ",");
		String[] cla=claz.split(",");
//		System.out.println(cla[1]+","+cla[2]);
		System.out.println(cla[cla.length-1]);
		System.out.println(cla[cla.length-2]);
		System.out.println(claz);
		String clazz = Thread.currentThread().getStackTrace()[1].getClassName();
		String method = Thread.currentThread().getStackTrace()[1].getMethodName();
		System.out.println(method);
	}

	public static String clazzName(String clazz){
		String[] cla=clazz.replace(".", ",").split(",");
		String className=cla[cla.length-1];
		return className;
	}
	
	public static String packName(String clazz){
		String[] cla=clazz.replace(".", ",").split(",");
		String packageName=cla[cla.length-2];
		return packageName;
	}
}
