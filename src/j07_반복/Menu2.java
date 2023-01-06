package j07_반복;

import java.util.Scanner;

public class Menu2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean flag3 = true;
		
		char select = '\0';
		
		while(flag3) {
			
			System.out.println("=======탄탄면 메뉴=======");
			System.out.println("1. 존나 매운 라면");
			System.out.println("2. 적당히 매운 라면");
			System.out.println("3. 안매운 라면");
			System.out.println("=========================");
			System.out.println("q. 프로그램 종료");
			System.out.println("=========================");
			
			System.out.println("탄탄면 메뉴 선택");
			
			select = scanner.next().charAt(0);
			
			if(select == 'q' || select == 'Q');
			
		}
	}

}
