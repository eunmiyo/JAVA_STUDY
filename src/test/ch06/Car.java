package test.ch06;

public class Car {
	//1.필드: 객체의 데이터를 저장
	String company = "현대자동차";
	String model; //모델
	String color;
	int maxSpeed;
	int speed; //속도
	static int numbering = 0; //전역변수
	boolean start; //시동여부
	
	//자바에서는 생성자를 명시하지 않으면 컴파일 과정에서 생성자를 생성해 준다.
	//Car(){}
	
	Car(){
		numbering++;
	}
	
	//객체가 생성이될 때 생성자에 할당
	// 매개변수의 타입, 개수, 순서 중 하나가 달라야함!
	Car(String model){
//		this.model = model;
		this(model, "블루", 250);
		// this(, ,) 필드에 가장 많은 할당을 받은애를 그대로 따라감
		/*
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		 */
	}
	
	Car(String model, String color){
//		this.model = model;
//		this.color = color;
		this(model, color, 250);
	}

	//class이름이랑 같게!
	//this: 객체안에서 쓰이는 필드명
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
