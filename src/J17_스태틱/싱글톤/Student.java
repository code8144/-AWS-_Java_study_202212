package J17_스태틱.싱글톤;

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

	@Override
	public String toString() {
		return "Student [studentCode=" + studentCode + ", name=" + name + "]";
	}
	
	

}
