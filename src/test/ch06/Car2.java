package test.ch06;

public class Car2 {

	//인스턴스 필드
	int speed;
	
	//인스턴스 메소드
	void run() {
		System.out.println(this.speed + "으로 달립니다.");
	}
	void run2() {
		run(); //this.run();
		System.out.println(this.speed + "으로 달립니다.");
	}
	
	/* static에서는 인스턴스 접근 불가능!!!
	static {
		this.speed = 200; 오류
		this.run;  오류
	}
	*/
	
	//static(정적) 메소드
	 static void simulate() {
		 //this.speed = 200; 오류, 객체를 생성해서 접근해야함
		 //this.run(); 오류
		 
		 //자신 안에서도 인스턴스를 생성할 수 있다.
		Car2 myCar = new Car2();
		
		myCar.speed = 200;
		myCar.run();
	}
	
	public static void main(String[] args) {
		//Car2.simulate(); 같은 클래스안에 있기때문에 클래스명 안붙여도 됨!
		simulate();// 호출
		
		Car2 myCar = new Car2();
		
		myCar.speed = 60;
		myCar.run();

	}

}
