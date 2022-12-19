package test.ch03;

public class BitShift {

	public static void main(String[] args) {
		//비트 이동 연산자
		
		//좌측 이동 연산자(<<) 1을 3칸 이동 2의 거듭제곱을 곱한 결과와 같다.
		// 1 * 2^3 = 8
		int num1 = 1;
		int result1 = num1 << 3;
		System.out.println(result1);
		
		//우측 이동 연산자(>>)
		//-8 / 2^3 = -1
		int num2 = -8;
		int result2 = num2 >> 3;
		System.out.println(result2);
		
		//우측 이동 연산자(>>>) 무조건 0으로 채움
		int num3 = -8;
		int result3 = num3>>> 3;
		System.out.println(result3);
	}

}
