package test.ch02;

public class test {

	public static void main(String[] args) {

		
//		System.out.println("1" + "2");
//		System.out.println('A' + 'B');
//		System.out.println('1' + 2);
//		System.out.println('1' + '2');
//		System.out.println('J' + "ava");
		
		
		System.out.printf("이름: %s\n", "감자바"); //문자열
		System.out.printf("정수: %d\n", 25); //정수
		System.out.printf("실수: %-10.2f\n", 3.14); //실수

		System.out.printf("정수출력1: %d, 실수출력: %f", 123, 3.45 );//정수, 실수
		
		System.out.printf("정수출력1: %-6d\n", 123);//6자리 정수 , 없는자리는 공백 출력
	
	}

}
