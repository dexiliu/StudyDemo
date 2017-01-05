package dynamic;

import java.lang.reflect.Method;

import code.A;

public class LoaderSomeClass {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws Exception{
		ClassLoaderSub classLoaderSub = new ClassLoaderSub();
		Class clazz = classLoaderSub.getClassByFile("bin/code/A.class");
		System.out.println("类的名字:"+clazz.getName());
		System.out.println("类的加载器:"+clazz.getClassLoader());
		classLoaderSub.loadClass(A.class.getName());
		Object obj = clazz.newInstance();
		Method method = clazz.getMethod("print");
		method.invoke(obj);
	}

}
