package j10_생성자;

public class J10_Student {
	
	String name;
	int age;
	
	//참조, 레퍼런스, 멤버변수로 불림
	//클래스에서는 지역변수와 멤버변수를 구분함
	
	J10_Student() {
		System.out.println("기본 생성자 호출");
		
	}
	
	J10_Student(int age) {
		System.out.println("학생의 나이 : " + age);
	}
	
	J10_Student(String name) {
		System.out.println("학생의 이름 : " + name);
	}
	
	J10_Student(String name, int age) {
		//this. 를 써 줌으로써 지역변수를 멤버변수로 바꿔줌.
		this.name = name;
		this.age = age;
	}
	
	void printInfo() {
		//여기서의 변수는 멤버변수
		System.out.println("학생 이름 : " + name);
		System.out.println("학생 나이 : " + age);
	}

}
