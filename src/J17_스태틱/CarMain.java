package J17_스태틱;

public class CarMain {
	
	public static void main(String[] args) {
		Car.getAutoIncrement();
		
		Car[] cars = new Car[5];
		
		cars[0] = new Car("K9");
		cars[1] = new Car("K8");
		cars[2] = new Car("K7");
		cars[3] = new Car("K6");
		cars[4] = new Car("K5");
		
		for(Car c : cars) {
			System.out.println(c);
			System.out.println();
		}
		
		System.out.println(Car.getAutoIncrement());
	}

}
