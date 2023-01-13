package J18_제네릭;

public class Main {
	
	public static void main(String[] args) {
		TestData<?, ?> td = new TestData<>("김상현", 28);
		TestData<?, ?> td2 = new TestData<>("KSH", 28.1);
		System.out.println(td);
		System.out.println(td2);
		
		CMRespDto<?> cm =
					new CMRespDto<>(200, "성공", td);
		
		System.out.println(cm);
	}

}
