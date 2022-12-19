package test.ch14.vector;

import java.util.ArrayList;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		/*
		 *List<Board> list2 = Vector<>(); 자동형변환
		 *Vector<> implement List<타입>
		 *List<타입>는 Vector<>의 상위 인터페이스
		 *Vector<String> list = new Vector<>();
		 *list.add("안녕");
		 *Vector<Integer> list = new Vector<>();
		 *list.add(5);
		 */
		Vector<Board> list = new Vector<>(); //동기화 가능!!!
//		ArrayList<Board> list = new ArrayList<>(); //동기화가 안됨!!!
		
		Thread threadA = new Thread() {
			@Override
			public void run() {
				for(int i=1; i<=1000; i++) { //1~1000
					list.add(new Board("제목", "내용", "글쓰기"));
				}
			}
			
		};
		
		Thread threadB = new Thread() {
			@Override
			public void run() {
				for(int i=1001; i<=2000; i++) {//1001~2000
					list.add(new Board("제목", "내용", "글쓰기"));
				}
			}
		};
		
		threadA.start();
		threadB.start();
		
		/*
		 * 작업 스레드들이 모두 종료될 때까지 메인 스레드를 기다리게 하는 코드
		 * join(): 스레드가 죽을때까지 기다린다.
		 */
		try {
			threadA.join();
			threadB.join();
		} catch(Exception e) {}
		
		/*
		 * threadA.start();, threadB.start(); 코드가
		 * 실행되기 전에 
		 *  int size = list.size();
			System.out.println("총 객체 수: " + size);
			System.out.println(); 
			얘네가 먼저 실행 됨
		 */
		int size = list.size();
		System.out.println("총 객체 수: " + size);
		System.out.println();

	}

}
