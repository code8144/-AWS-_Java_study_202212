package J16_Object;

import java.util.Objects;

public class Student {
	private String name;		//private이여도 동일클래스내에선 바로 접근이 가능함
	private int age;			//클래스가 다를 시 getter로 접근
	
	public Student(String name, int age) {			//Object클래스는 항상 가짐(최상위 클래스)
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false;
		}
		
		if(!(obj.getClass() == Student.class)) {	//instance of 쓰지말것. getClass와 .class로 쓸것
			return false;
		}
		
			Student s = (Student) obj;
			boolean result = name.equals(s.name) && age == s.age;
		
		
		return result;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + "\n나이 : " + age;
	}
	
	

}
