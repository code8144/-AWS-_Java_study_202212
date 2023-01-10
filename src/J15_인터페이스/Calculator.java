package J15_인터페이스;

public interface Calculator {
	
	public int ERROR = -999999; // final 생략 가능(상수만 사용 가능하기때문)
	
	public double plus(double x, double y); //abstract의 키워드를 넣지않아도 abstract가 숨겨져있음.
	
	public double minus(double x, double y);
	
	public default double multiplication(double x, double y) { //메소드를 쓰고싶으면 default를 써준다.
		
		return x * y; //일반변수(멤버변수)를 가지지 못한다. 대신 상수는 가질 수 있음.
	}
	
	public double division(double x, double y);
	

}
