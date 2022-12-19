package test.ch11.Object;

public class ToStringEx {

	public static void main(String[] args) {
		//객체생성
		SmartPhone  myPhone = new SmartPhone("삼성전자", "안드로이드");
		
		//toString: 객체의 문자정보를 리턴한다.
		//test.ch11.Object.SmartPhone@6f2b958e
		//-> @6f2b958e: 객체를 나타내는 16진수 해시코드
		//오버라이드를 해서 사용 할때는 특별하게 나타내고 싶은 문자 정보를 리턴
		String strobj = myPhone.toString();
		System.out.println(strobj);
		System.out.println(myPhone);
		
		try {
			int value = Integer.parseInt("1oo");
		} catch(NumberFormatException e) {
			System.err.println("에러입니다.");
		}
	}

}
