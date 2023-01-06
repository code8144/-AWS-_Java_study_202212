package j03_형변환;

public class Castring2 {

	public static void main(String[] args) {
		char char_a = 'a';
		int num = (int) char_a;
		
		char char_b = (char) (num + 1); //다운캐스팅은 형변환 생략불가, 명시적 형변환
		
		System.out.println('a' + 1);
		System.out.println(char_b);

	}

}
