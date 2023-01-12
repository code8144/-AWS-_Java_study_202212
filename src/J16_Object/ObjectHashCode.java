package J16_Object;

public class ObjectHashCode { //해시란 데이터를 다루는 기법중에 하나로 검색과 저장이 아주 빠르게 진행된다.
	
	public static void main(String[] args) {
		Student s1 = new Student("김상현", 28);
		Student s2 = new Student("김상현", 28);
		SubStudent s3 = new SubStudent("김상현", 28);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1.hashCode() == s2.hashCode());
		System.out.println(s1.hashCode() == s3.hashCode());
	}

}
