package J13_상속;

public class ExtendsMain {
	
	public static void main(String[] args) {
		
		KiaCar kC = new KiaCar();
		
		System.out.println(kC);
		
		kC.setPrice(30000000);
		
		System.out.println(kC);
		
		System.out.println(kC.getPrice());
		System.out.println(kC.discountPrice(20));
	}

}
