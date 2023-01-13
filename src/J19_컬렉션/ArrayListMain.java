package J19_컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListMain {
	
	/**
	 * CRUD (Create, Read, Update, Delete)
	 * 
	 */
	
	public static void main(String[] args) {
		List<String> strList = new ArrayList<>();
		
		// * 값 추가
		strList.add("java");
		strList.add("pytyon");
		System.out.println(strList);
		
		//값 원하는 위치에 추가
		strList.add(1, "android");
		System.out.println(strList);
		
		// * 해당 인덱스의 값을 추출
		System.out.println(strList.get(0));	//0번에 있는 인덱스값을 꺼내라
		String lang = strList.get(1);
		System.out.println(lang);
		
		//리스트에 해당 값이 있는지 확인(T , F)
		System.out.println(strList.contains("c++")); //contains로 해당값이 들어있는지 확인
		System.out.println(strList.contains(lang));
		
		//값 수정
		strList.set(2, "javascript");
		System.out.println(strList);
		
		// * 값 삭제
		strList.remove("android");	//값으로도 지울수있고 키로도 지울수있음
		System.out.println(strList);
		strList.remove(1);
		System.out.println(strList);
		
		// * 리스트의 크기 확인
		System.out.println(strList.size());
		
		//리스트가 비었는지 확인
		System.out.println(strList.isEmpty());
		
		//리스트 초기화
		strList.clear();
		System.out.println(strList.isEmpty());
		
		/* *
		 * 배열을 리스트로 변환
		 * Arrays.asList(배열);
		 */
		String[] langs = {"java", "c++", "python", "javascript"};
		List<String> tempList = Arrays.asList(langs);
		strList.addAll(tempList);
		strList.addAll(2, tempList);
		System.out.println(strList);
		
		// * 해당 값의 위치(index) 왼쪽부터 찾기
		int findIndexLeft = strList.indexOf("python");
		System.out.println(findIndexLeft);
		
		// * 해당 값의 위치(index) 오른쪽부터 찾기
		int findIndexRight = strList.lastIndexOf("java");
		System.out.println(findIndexRight);
		
		///////////////////////////////////////////////////////
		
		strList.set(1, "java"); //1번 index의 값을 java로 바꿔라
		System.out.println(strList);
		strList.subList(strList.indexOf("java") + 1, strList.size()).indexOf("java");
		
		///////////////////////////////////////////////////////
		
		//fromIndex 부터 toIndex전까지 매개변수 index값 1부터 4까지
		List<String> subList = strList.subList(1, 4);
		System.out.println(subList);
		
		
		
		// ======================<< 반복 >>======================
		//일반 반복문
		for(int i = 0; i < strList.size(); i++) {
			System.out.println("[" + i + "] : " + strList.get(i));
		}
		System.out.println();
		
		//forEach
		for(String str : strList) {
			System.out.println("[값] : " + str);
		}
		System.out.println();
		
		//람다식 forEach
		strList.forEach(str -> System.out.println("[값2] : " + str));
		System.out.println();
		
		//반복자
		Iterator<String> iterator = strList.iterator();
		while(iterator.hasNext()) {
			String lang2 = iterator.next();
			System.out.println("[값3] : " + lang2);
		}
		
	}

}
