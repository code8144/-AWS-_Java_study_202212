package J16_Object;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ObjectGetClass {
	
	public static void main(String[] args) {
		Student student = new Student("김상현", 28);
		
		System.out.println(student.getClass());
		System.out.println(Student.class);		//클래스에는 .class
		
		System.out.println(student.getClass().getName());		//객체에는 .getClass
		
		Class studentClass = student.getClass();
		
		String className = studentClass.getName();
		System.out.println("클래스 이름 : " + className);
		
		String simpleName = studentClass.getSimpleName();
		System.out.println("클래스 이름만 : " + simpleName);
		
		Field[] fields = studentClass.getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field);
		}
		
		System.out.println();
		
		Method[] methods = studentClass.getDeclaredMethods();
		for(Method method : methods) {
			System.out.println(method);
		}
	}

}
