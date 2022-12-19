package test.ch14.vector;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListEx {
	/*
	 * List
	 * 순서를 유지하고 저장
	 * 중복 저장 가능
	 * 구현 클래스
	 * ArrayList<>, Vector<>, LinkedList<>
	 */

	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		LinkedList<String> list2 = new LinkedList<String>();
		
		//시작 시간과 끝 시간을 저장할 변수 선언
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			/*
			 * valueOf(인덱스번호)
			 * 
			 */
			list1.add(0, String.valueOf(i)); //0번 인덱스 값이 계속 수정됨
		}
		
		endTime = System.nanoTime();
		
		System.out.println("ArrayList 걸린 시간: " + (endTime-startTime));
//		System.out.printf("%-17s %8d ns \n", "ArrayList 걸린 시간: ", (endTime-startTime) );
	
		startTime = System.nanoTime();
		for(int i=0; i<10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린 시간: " + (endTime-startTime));
//		System.out.printf("%-17s %8d ns \n", "LinkedList 걸린 시간: ", (endTime-startTime) );
	}

}
