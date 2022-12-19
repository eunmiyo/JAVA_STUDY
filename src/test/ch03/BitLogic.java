package test.ch03;

public class BitLogic {

	public static void main(String[] args) {
		//논리곱(AND), 두 비트 모두 1일 경우에만 연산 결과가 1
		//2진수이용 45(00101101) 25(00011001)
		System.out.println("45 & 25 = " + (45 & 25));
		
		//논리합(OR), 두 비트 중 하나만 1이면 연산 결과는 1
		System.out.println("45 | 25 = " + (45 | 25));
		
		//배타적 논리합(XOR), 두 비트 중 하나는 1이고 다른 하나가 0일경우 연산 결과는 1
		System.out.println("45 ^ 25 = " + (45 ^ 25));
		
		//논리 부정(NOT), 보수
		System.out.println("~45 = " + (~45));
		
		//2진수를 10진수로 바꿔서 출력
		System.out.println("-------------------------- ");
	
		byte recieveData = -128;
		int unsignedInt = Byte.toUnsignedInt(recieveData);
		System.out.println(unsignedInt);
	}

}
