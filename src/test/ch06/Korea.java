package test.ch06;

public class Korea {
	//인스턴스 필드
	//final필드: 저장된 값들을 절대로 변경할 수 없다. 최종값, 변하면 안되는 값에 붙여준다. 
	//final필드는 초기값을 무조건 줘야한다.(필드 선언시 주거나 생성자에서 줘야한다)
	final String nation = "대한민국";
	final String ssn; //주민번호
	
	//인스턴스 필드
	String name;
	
	//생성자
	Korea(String ssn, String name){
		this.ssn = ssn;
		this.name = name;
	}
}
