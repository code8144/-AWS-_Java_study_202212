package j05_입력;

import java.util.Scanner;

public class Input3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = scanner.next();
		
		System.out.print("나이 : ");
		int number1 = scanner.nextInt();
		scanner.nextLine();
		
		System.out.print("주소 : ");
		String address = scanner.nextLine();
		
		System.out.print("연락처 : ");
		String phone = scanner.next();
		
		System.out.println("사용자의 이름은 " + name +"이고" + " 나이는 " + number1 + "입니다");
		System.out.println("주소는 " + address + "에 거주중입니다.");
		System.out.println("연락처는 " + phone + "입니다.");
		

	}

}
