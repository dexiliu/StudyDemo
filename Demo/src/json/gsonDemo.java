package json;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class gsonDemo {

	public static void main(String[] args) {
		Gson gson = new Gson();  
		  
        Student student1 = new Student();  
        student1.setId(1);  
        student1.setName("李坤");  
        student1.setBirthDay(new Date());  
  
        // //////////////////////////////////////////////////////////  
        System.out.println("----------简单对象之间的转化-------------");  
        // 简单的bean转为json  
        String s1 = gson.toJson(student1);  
        System.out.println("简单Bean转化为Json===" + s1);  
  
        // json转为简单Bean  
        Student student = gson.fromJson(s1, Student.class);  
        System.out.println("Json转为简单Bean===" + student.getId()+","+student.getName()+","+student.getBirthDay());  
        
        Student student2 = new Student();  
        student2.setId(2);  
        student2.setName("曹贵生");  
        student2.setBirthDay(new Date());  
  
        Student student3 = new Student();  
        student3.setId(3);  
        student3.setName("柳波");  
        student3.setBirthDay(new Date());  
  
        List<Student> list = new ArrayList<Student>();  
        list.add(student1);  
        list.add(student2);  
        list.add(student3);  
  
        System.out.println("----------带泛型的List之间的转化-------------");  
        // 带泛型的list转化为json  
        String s2 = gson.toJson(list);  
        System.out.println("带泛型的list转化为json==" + s2);
        
        // json转为带泛型的list  
        List<Student> retList = gson.fromJson(s2,  
                new TypeToken<List<Student>>() {}.getType());  
        for (Student stu : retList) {  
            System.out.println(stu.getId());
            System.out.println(stu.getName());
            System.out.print(stu.getBirthDay()+"\n");
        } 
	}

}
