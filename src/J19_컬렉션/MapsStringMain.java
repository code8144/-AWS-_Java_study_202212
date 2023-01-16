package J19_컬렉션;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapsStringMain {
	
	public static void main(String[] args) {
		Map<String, String> strMap = new HashMap<>();
		
		strMap.put("김상현", "A");
		strMap.put("강의진", "B");
		strMap.put("김종환", "C");
		strMap.put("진채희", "D");
		
		System.out.println(strMap);
		
		System.out.println(strMap.get("a"));
		System.out.println(strMap.get("e"));
		
		for(String s : strMap.keySet()) {
			System.out.println(strMap.get(s));
			System.out.println(s);
		}
		
		for(String k : strMap.keySet()) {
			System.out.println("ker : " + k);
			System.out.println(strMap.get(k));
		}
		
		for(String v : strMap.values()) {
			System.out.println("value : " + v);
			
			System.out.println();
		}
		
		for(Entry<String, String> entry : strMap.entrySet()) {
			System.out.println(entry);
			System.out.println("key : " + entry.getKey());
			System.out.println("value : " + entry.getValue());
		}
		
		System.out.println("============================");
		
		strMap.forEach((k, v) -> {
			System.out.println("key : " + k);
			System.out.println("value : " + v);
		});
	}

}
