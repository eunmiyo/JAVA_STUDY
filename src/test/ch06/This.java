package test.ch06;

public class This {
	//필드
	String model;
	int speed;
	
	//매개변수명이 필드에 있는 데이터명과 같으면 필드데이터에 this.을 붙여준다!
	This(String model){//매개변수
		this.model = model;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		//같은 클래스 간의 메소드를 호출시 this. 생략가능
		//this.setSpeed(100);
		setSpeed(100);
		//this.model, this.speed this.생략가능
		System.out.println(model + "," + speed);
	}
}
