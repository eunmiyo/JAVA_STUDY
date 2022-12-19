package test.ch05;

public class test {

	public static void main(String[] args) {
		//05.참조타입 문제
		
		System.out.println("-----6번답-----");
		//6번
		int [][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		System.out.println(array.length);
		System.out.println(array[2].length);
		
		System.out.println("-----7번답-----");
		//7번
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		for (int i=0; i<5; i++) {
			sum += arr[i];
		}
		System.out.println(sum);
		
		System.out.println("-----8번답-----");
		//8번
		int[] arr8 = {1, 5, 3, 8, 2};
		int max = 0;
		for(int j=0; j<5; j++) {
			if(max < arr8[j]) {
				max = arr8[j];
			}
		}
		System.out.println(max);
		
		System.out.println("-----9번답-----");
		//9번
		int [][] array9 = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		int totalStudent = 0;
		int totalSum = 0;
		
		for (int i = 0; i < array9.length; i++) {
			totalStudent += array9[i].length; //총 학생 수
			for (int k=0; k<array9[i].length; k++) {
				totalSum += array9[i][k]; //점수 합산
			}
		}
		System.out.println("전체 학생 합산 점수: " + totalSum);
		double totalAvg = (double) totalSum / totalStudent;
		System.out.println("전체 학생 평균 점수: " + totalAvg);
		
		System.out.println("-----10번답-----");
		//10번
		int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		int[] ball3 = new int[3];
		//배열 ballArr의 임의의 요소를 골라서 위치를 바꾼다.
		for (int i=0; i<ballArr.length; i++) {
			int j = (int) (Math.random()* ballArr.length);
			int tmp = 0;
			tmp = ballArr[i];
			ballArr[i] = ballArr[j];
			ballArr[j] = tmp;
		}
		//배열 ballArr의 앞에서 3개의 수를 배열 ball3로 복사한다.
		
		for(int i=0; i<ball3.length; i++) {
			System.out.print(ball3[i]);
		}
		System.out.println();
	}	
}
