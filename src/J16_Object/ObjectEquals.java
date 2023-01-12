package J16_Object;

public class ObjectEquals {
	
	public static void main(String[] args) {
		String name1 = "김상현";
		String name2 = "김상현";
		String name3 = new String("김상현");	//name1,2와 name3는 다름
		
		System.out.println(name1);				//같은 주소이기때문에 String이여도 == 가 가능
		System.out.println(name2);				//원래는 .equals로 비교
		
		System.out.println(name1 == name2);
		System.out.println(name1.equals(name3));
		
///////////////////////////////////////////////////////////////////////////////////
		
		Student s1 = new Student("김상현", 28);		//new를 붙여줬기때문에 각자 주소가 따로 생성됨
		Student s2 = new Student("김상현", 28);
		SubStudent s3 = new SubStudent("김상현", 28);
									
		
		System.out.println(s1.equals(s2));
	}
	

}
