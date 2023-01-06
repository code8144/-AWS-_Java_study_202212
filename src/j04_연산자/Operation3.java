package j04_연산자;

/*
 * 논리연산자(0과 1을 가지고 계산하는 것)
 * 거짓이 아니면 무조건 참(0이 아니면 무조건 1)
 * 
 * AND(곱) T && T (1 * 1), T && F (1 * 0) //조건중 하나라도 0이면 0
 * 
 * OR(합) T || F // 조건중 하나라도 참이면 참
 * 
 * NOT(부정) !T // 참이면 거짓, 거짓이면 참
 */

public class Operation3 {
	public static void main(String[] args) {
		int num = 11;
		
		boolean flag1 = true;
		boolean flag2 = true;
		boolean flag3 = num % 2 == 0;
		
		System.out.println(flag1 && flag2);
		System.out.println(flag1 && flag3);
		System.out.println(!(flag2 || flag3 && flag1));
	}

}
