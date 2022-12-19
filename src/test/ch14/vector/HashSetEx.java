package test.ch14.vector;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
	/*
	 * Set
	 * 저장순서를 유지하지 않는다.
	 * 동일한 객체는 중복 저장하지 않는다.
	 * Set은 중복된 값을 저장하지 않는다!
	 * 구현 클래스
	 * HashSet<>, TreeSet<>
	 */
	public static void main(String[] args) {
//		HashSet<String> set = new HashSet<String>();
		//HashSet<>의 부모 Set<> 자동형변환
		Set<String> set = new HashSet<String>();
		
		set.add("java");
		set.add("apple");
		set.add("banana");
		set.add("java");
		
		int size = set.size();
		System.out.println(size);

	}

}
