package j02_변수;

public class Variable2 {

	public static void main(String[] args) {
		char firstName1 = '상'; // char 에는 무조건 ' 작은 따옴표가 와야함
		char firstName2 = '현'; // char는 한글자만 가 능
		
		char alphabetA = 'A';
		
		System.out.println("김" + firstName1 + firstName2);
		System.out.println("알파벳A: " + alphabetA);
		
		System.out.println(alphabetA + 'B');
		System.out.println(alphabetA);
		System.out.println("\uAC00"); // 아스키코드
		System.out.println(firstName1 + 0); // 유니코드

	}

}
