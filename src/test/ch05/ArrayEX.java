package test.ch05;

public class ArrayEX {

	public static void main(String[] args) {
		int[] arr1 = new int[3]; //방3개를 만듦, 3개의 데이터를 넣을 수 있음
		
		/*
		 초기값
		 int, short, byte: 0
		 long: 0L
		 char: '\u0000'
		 float: 0.0f
		 double: 0.0
		 boolean: false
		 
		 String: null
		 */
		
		for(int i=0; i<3; i++) {
//			System.out.println(arr1[i]);
			arr1[i] = 10;
		}
		
		for(int i=0; i<3; i++) {
			System.out.println(arr1[i]);
		}
		
		System.out.println();
		double[] arr2 = new double[3];
		for(int i=0; i<3; i++) {
			System.out.println(arr2[i]);
		}
		
		System.out.println();
		String[] arr3 = new String[3];
		for(int i=0; i<3; i++) {
			System.out.println(arr3[i]);
		}
		
//		arr3.length = 10; length는 값을 읽을수만 있다.
		
		/*
//		String[] season = {"Spring", "Summer", "Fall", "Winter"};
//		String season2[]; 선언만
		String season[] = {"Spring", "Summer", "Fall", "Winter"};
		
		System.out.println(season[0]);
		System.out.println(season[1]);
		System.out.println(season[2]);
		System.out.println(season[3]);
		System.out.println();

		season[1] = "여름";
		System.out.println(season[1]);
		System.out.println();
		
		int[] score = {83, 90, 87};
		
		//총합, 평균
		int sum = 0;
		for (int i=0; i<3; i++) {
			sum += score[i];
		}
		double avg = (double) sum/3;
		
		System.out.println("총합= " + sum);
		System.out.println("평균= " + avg);
		 */
	}

}
