package test.ch03;

public class OverflowUnderflow {

	public static void main(String[] args) {
		byte var1 = 125; //byte: -128 ~ 127
		//오버플로우: 타입이 허용하는 최대값을 벗어나는 것 
		//가장 작은 쪽으로 돌아가서 실행

		for (int i=0; i<5; i++) {
			var1++;
			System.out.println("var1: "+ var1);
		}
			
		
		byte var2 = -125; //byte: -128 ~ 127
		//언더플로우: 타입이 허용하는 최소값을 벗어나는 것
		// 가장 큰 쪽으로 돌아가서 실행
			for (int i=0; i<5; i++) {
				var2--;
				System.out.println("var2: "+ var2);
			}
	}

}
