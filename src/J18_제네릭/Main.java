package J18_제네릭;

public class Main {
	
	public static void main(String[] args) {
		TestData<Integer> td = new TestData("김상현", 28);
		TestData<Double> td2 = new TestData("ksh", 28.1);
		System.out.println(td);
		System.out.println(td2);
	}

}
