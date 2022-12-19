package test.ch03;

public class LogicalOperator {

	public static void main(String[] args) {
		//논리 연산자
		int charCode = 'A'; //유니코드 65
		
		//65~90
		//(65 <= charCode):false면 (charCode <= 90)뒤에도 연산함
		if ((65 <= charCode) & (charCode <= 90)) {
			System.out.println("대문자이군요.");
		}
		//97~122
		//(97 <= charCode): false면 (charCode <= 122):연산하지 않음
		if((97 <= charCode) && (charCode <= 122)) {
			System.out.println("소문자이군요.");
		}
		//48~57
		if((48 <= charCode) && (charCode <= 57)) {
			System.out.println("0~9 숫자군요.");
		}
		
		int value = 6;
		//(value%2 == 0):true여도 뒤에 연산함
		if ((value%2 == 0) | (value%3 == 0)) {
			System.out.println("2또는 3의 배수");
		}
		//(value%2 == 0):true면 뒤에 연산안함
		if ((value%2 == 0) || (value%3 == 0)) {
			System.out.println("2또는 3의 배수");
		}

	}

}
