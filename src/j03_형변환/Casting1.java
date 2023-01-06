package j03_형변환;

public class Casting1 {

	public static void main(String[] args) {
		char a = 'a';
		int num1 = a;// 업캐스팅은 형변환 생략가능, 묵시적 형변환
		
		System.out.println((double) a); //아스키코드 값
		System.out.println((char) 97.0);
		System.out.println((byte) 300);

	}

}
