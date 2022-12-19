 package test.ch14.vector;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetEx {
/*
 * TreeSet
 * 이진트리 기반: 여러개의 노트가 트리 형태로 연결된 구조
 * 정렬시 부오의 노트 객체와 비교해서 낮은것은 왼쪽, 높은것은 오른쪽에 저장
 * 추가 삭제에는 시간이 걸리지만 정렬, 검색에 높은 성능을 보인다.
 */
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		
		//데이터 추가
		scores.add(7);
		scores.add(4);
		scores.add(1);
		scores.add(5);
		scores.add(9);
		
		for(Integer s : scores) {
			System.out.print(s + " ");//자동으로 정렬(오름차순)
		}
		
		System.out.println();
		
		System.out.println("가장 낮은 값: " + scores.first());
		System.out.println("가장 높은 값: " + scores.last());
		System.out.println("5보다 작은 값: " + scores.lower(5)); //5보다 작은값, 값을 하나만 출력
		System.out.println("5보다 큰 값: " + scores.higher(5)); //5보다 큰값, 값을 하나만 출력
	
		System.out.println();
		
		//내림차순(NavigableSet<타입>, descendingSet())
		NavigableSet<Integer> desc = scores.descendingSet();
		for(Integer s : desc) {
			System.out.print(s + " ");
		}
		
		System.out.println();
		
		//범위검색(5 <= score)
		//tailSet(값, boolean): 주어진 값보다 높은 값을 가져온다.
		//boolean은 해당값을 포함하는지 안하는지 확인.
		NavigableSet<Integer> rangeSet = scores.tailSet(5, true);
		for(Integer s : rangeSet) {
			System.out.print(s + " ");
		}
		
		System.out.println();
		
		//범위 검색(4 <= score < 9)
		//subSet(4, true, 9, false) -> 포함: true, 불포함: false
		rangeSet = scores.subSet(4, true, 9, false);
		for(Integer s : rangeSet) {
			System.out.print(s + " ");	
		}
	}

}
