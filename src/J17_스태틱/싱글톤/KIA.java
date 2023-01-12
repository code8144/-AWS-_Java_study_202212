package J17_스태틱.싱글톤;

public class KIA {
	//싱글톤 기본세트(무조건 이렇게 만듦)
	private static KIA instance = null;
	
	private KIA() {}	//private은 클래스 안에서만 호출가능
	
	public static KIA getInstance() {
		if(instance == null) {
			instance = new KIA();
		}
		return instance;
	}
	
	public void printCompanyName() {
		System.out.println(getClass().getSimpleName());
	}

}
