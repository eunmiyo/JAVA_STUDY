package test.ch04;

public class While_EX {

	public static void main(String[] args) {
		int i = 1;
		
		//while(): 조건식이 참 일때 실행
//		while (i<=10) {
//			System.out.println(i);
//			i++;
//		}
		
		//1~100까지 합계 구하기
		/*
		int sum = 0;
		while (i <= 100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		*/
		
		// do-while
		do {
			i++;
			System.out.println(i);
		}while(i<=10);

	}

}
