package j10_생성자;

public class J10_StudentMain {
	
	public static void main(String[] args) {
		
		
		J10_Student s1 = new J10_Student("김상현", 28);
		s1.printInfo();
		
		s1.name = "김준일";
	}

}
