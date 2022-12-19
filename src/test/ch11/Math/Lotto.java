package test.ch11.Math;

import java.util.Arrays;
import java.util.Random;

public class Lotto {

	public static void main(String[] args) {
		//선택번호(사용자가 선택한 번호)
		int[] selectNumber = new int[6]; //로또번호 6개가 저장될 배열
		Random random = new Random(3);
		System.out.print("선택번호: ");
		
		//랜덤 숫자 6개를 생성해서 배열에 넣어줌
		for (int i=0; i<6; i++) {
			//random.nextInt(45) + 1
			//-> 1~45범위의 숫자를 만든다.
			selectNumber[i] = random.nextInt(45) + 1; 
			System.out.print(selectNumber[i] + " ");
		}
		
		System.out.println("");
		
		//당첨번호(컴퓨터가 랜덤으로 주는 번호)
		int[] winNumber = new int[6]; 
		Random random2 = new Random(5);
		System.out.print("당첨번호: ");
		
		for (int i=0; i<6; i++) {
			winNumber[i] = random2.nextInt(45) + 1; 
			System.out.print(winNumber[i] + " ");
		}
		
		System.out.println("");
		
		//당첨여부
		//sort(int[] a): 배열 정렬
		//비교하기 전에 배열 값을 정렬: 
		//-> 배열 내부의 값들이 정렬된 상태로 바뀐다.
		Arrays.sort(selectNumber);
		Arrays.sort(winNumber);
		
		//equals(int[] a, int[]a2): 배열의 값이 같은지 비교
		boolean result = Arrays.equals(selectNumber, winNumber);
		System.out.print("당첨여부: ");
		
		if(result) {
			System.out.print("당첨 되셨습니다.");
		} else {
			System.out.print("당첨 되지 않으셨습니다.");	
		}
	}

}
