package J21_예외;

import java.util.Arrays;
import java.util.List;

public class ThrowsException {
	
	public static void printList(List<String> list, int size) throws Exception {
		
		for(int i = 0; i < size; i++) {
			System.out.println("[" + i + "]" + list.get(i));
		}
		
	}
	
	public static void main(String[] args) {
		
		String[] names = {"김수현", "이종현", "박성진", "김동민"};
		
		
		
		try {
			printList(Arrays.asList(names), 5);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {							//finally는 예외처리가 되든안되는 무조건 실행
			System.out.println("무조건 실행");
		}
		
		System.out.println("프로그램 정상 종료");
	}
	
	

}
