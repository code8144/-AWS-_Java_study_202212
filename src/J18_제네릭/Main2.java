package J18_제네릭;

public class Main2 {
	
	/*
	 * ? 와일드카드 제약
	 * extends	대상 객체 하위(super보다는 extends를 많이 씀)
	 * super	대상객체 상위
	 */
	
	public CMRespDto<?> reponse(CMRespDto<?> cmRenpDto) {
		System.out.println("[응답데이터]");
		System.out.println(cmRenpDto);
		return cmRenpDto;
	}
	
	public static void main(String[] args) {	//메소드 호출전에 클래스안에 들어있는 메소드를 호출하려면
		Main2 main = new Main2();				//클래스를 먼저 생성해줘야 클래스안에 있는 메소드 사용가능
		
		 CMRespDto<String> hello 
				= new CMRespDto<String>(200, "성공", "안녕하세요");
		
		CMRespDto<Integer> score = new CMRespDto<Integer>(200, "성공", 85);
		
		System.out.println("hello");
		System.out.println(main.reponse(hello));
		
		System.out.println("score");
		System.out.println(main.reponse(score));	// ?를 와일드카드라고 함
		// 안녕하세요.
	}

}
