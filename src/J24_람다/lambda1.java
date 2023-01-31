package J24_람다;

import J22_익명클래스.Calculator;

public class lambda1 {
	
	public static void main(String[] args) {
		Instrument itt = new Instrument() {

			@Override
			public String play(String instrument) {
		
				return instrument + "을(를) 연주합니다";
			}
		
		};
		
		//추상 메서드를 하나만 가진 인터페이스만 람다 사용가능
		
		Instrument itt2 = (String instrument) -> {
			return instrument + "을(를) 연주합니다";
		};
		
		// 매개변수의 자료형을 생략할 수 있다.
		// 매개변수의 이름을 바꿀 수 있다.
		Instrument itt3 = (instrument) -> {
			return instrument + "을(를) 연주합니다";
		};
		
		// 매개변수가 하나이면 매개변수를 감싸는 괄호를 생략할 수 있다.
		Instrument itt4 = instrument -> {
			return instrument + "을(를) 연주합니다";
		};
		// 구현부의 명령이 하나일 때 중괄호를 생략할 수 있다.
		// 이때 리턴자료형이 정해져있으면 리턴값으로 사용이 된다.
		Instrument itt5 = instrument -> instrument + "을(를) 연주합니다.";
		
		int result = 10 + 20;
		
		Instrument itt6 = itm -> itm + "을(를) 연주합니다." + result;
		
		
		System.out.println(itt.play("피아노"));
		
		System.out.println(itt2.play("드럼"));
		
		System.out.println(itt6.play("기타"));
	}

}
