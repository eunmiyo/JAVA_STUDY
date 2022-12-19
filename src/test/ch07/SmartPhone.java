package test.ch07;

//자식클래스
//extends phone(부모클래스) 상속, 부모 필드에 접근 가능
public class SmartPhone extends phone{
	//필드
	public boolean wifi;
	
	//생성자
	public SmartPhone(String model, String color) {
		//super: 부모클래스의 생성자를 호출할 때
		//매개변수 없을 때() 사용가능
		super();
		System.out.println("자식 생성자 실행");
		this.model = model; //초기값
		this.color = color;
		
//		super(model, color)
		//부모클래스에서 초기값을 주었을 때
		
		/*
		//부모필드에 초기값을 준다.
		this.model = model;
		this.color = color;
		*/
	}

	//메소드
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태 변경");
	}
	
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}
}
