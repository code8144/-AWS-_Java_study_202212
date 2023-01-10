package j09_클래스;

public class J09_Student {      //클래스는 변수와 메소드를 묶어놓은 것
	
	String name = "김상현";
	int age = 28;
	
	//기본생성자
	J09_Student() {
		System.out.println("생성됨!!!!");
	}
	
	void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
	}

}
