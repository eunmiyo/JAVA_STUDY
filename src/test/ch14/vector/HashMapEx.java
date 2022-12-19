package test.ch14.vector;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {
/*
 * Map
 * 키와 값으로 구성된 저장
 * 키는 중복 저장 안됨
 * 구현클래스
 * HashMap<>, HashTable<>, TreeMap<>, Properties<>
 */
	public static void main(String[] args) {
		// Map<>은 HashMap<>의 부모 자동형변환 
		//HashMap<key, 객체(저장할 값)>
		Map<String, Integer> map = new HashMap<>();
		
		//put(String key, Integer Value)
		map.put("전은미", 85); //Entry
		map.put("용사여", 90);
		map.put("미미", 80);
		map.put("용용", 95);
//		map.put("용용", 95); 키는 하나여야 한다.
		
		System.out.println("총 Entry 수: " + map.size());
		
		//키로 값 얻기
		//-> key를 입력해야 값을 리턴한다.
		String key = "전은미";
		int value = map.get(key);
		System.out.println(key + ":" + value);
		
		System.out.println();
		
		//반복해서 키와 값을 얻기 (Iterator<타입>)
		//Iterator<String> 형을 리턴
		Set<String> keySet = map.keySet();
		Iterator<String> keyItorator = keySet.iterator(); //반복된 키를 얻는다.
		
		while(keyItorator.hasNext()) {
			String k = keyItorator.next();
			Integer v = map.get(k);
			System.out.println(k + ":" + v);
		}
		
		System.out.println();
		
		//반복해서 키와 값을 얻기 두번째 방법(Entry<타입, 타입>)
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryInterator = entrySet.iterator(); //반복된 키를 얻는다.
		
		while(entryInterator.hasNext()) {
			Entry<String, Integer> entry = entryInterator.next();
			String k = entry.getKey(); // 키를 가져옴
			Integer v = entry.getValue(); //값을 가져옴
			System.out.println(k + ":" + v);
		}
	}

}
