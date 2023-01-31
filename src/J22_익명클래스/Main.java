package J22_익명클래스;

public class Main {
	
	public static void main(String[] args) {
		Calculator c1 = new Addition();
		System.out.println(c1.calc(10, 20));
		
///////////////////////////////////////////////////////////////////////////////////////////////
		
		Calculator c2 = new Calculator() {
			
			@Override
			public int calc(int x, int y) {
				return x - y;
			}
		};
		Calculator c3 = (x, y) -> x * y;	//위의 메소드 정의 한 것과 같음(람다)
		
		System.out.println(c2.calc(200, 100));
		
		System.out.println(c3.calc(20, 3));
	}

}
