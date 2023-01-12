package J17_스태틱;

public class Student {
	
	private final static int code = 20230000;
	private static int ai = 1; //auto_intcrement
	
	private int studentCode;
	private String name;
	
	public Student(String name) {
		studentCode = code + ai;
		ai++;
		this.name = name;
	}
	
	public static int getAutoIncrement() {
		System.out.println("현재 AI : " + ai);
//		System.out.println("학생이름 : " + name);  //객체가 생성이 되어야 사용가능함 name
		return ai;		//static 메소드안에서는 static 변수만 쓸 수 있음
	}

	@Override
	public String toString() {
		return "Student [studentCode = " + studentCode + ", name=" + name + "]";
	}
	
	

}
