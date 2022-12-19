package test.ch05;

public class EqualsEX {

	public static void main(String[] args) {
		//String은 리터럴이 같으면 같은 주소를 가르킨다.(참조한다)
		String strVal1 = "전은미";
		String strVal2 = "전은미";
		
		if(strVal1 == strVal2) { //주소를 비교
			System.out.println("strVal1와 strVal2는 참조가 같음");
		} else {
			System.out.println("strVal1와 strVal2는 참조가 다름");			
		}
	
		//값을 비교할 때 equals함수를 사용
		if(strVal1.equals(strVal2)) {
			System.out.println("strVal1와 strVal2는 문자열이 같음");			
		}
	
		//new로 생성하면 같은 값이라도 가르키는 주소가 다르다.
		String strVal3 = new String("전은미");
		String strVal4 = new String("전은미");
		
		if(strVal3 == strVal4) { 
			System.out.println("strVal3와 strVal4는 참조가 같음");
		} else {
			System.out.println("strVal3와 strVal4는 참조가 다름");			
		}
		
		//값을 비교할 때 equals함수를 사용
		if(strVal3.equals(strVal4)) {
			System.out.println("strVal3와 strVal4는 문자열이 같음");			
		}
	}
	
}
