package J17_스태틱;

public class TestA {
	
	private static int num;				//static은 공유하는 영역
	
	public static void setNum(int num) {
		TestA.num = num;
	}
	
	public static int getNum() {
		return num;
	}

}
