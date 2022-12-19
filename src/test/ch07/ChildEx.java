package test.ch07;

public class ChildEx {

	public static void main(String[] args) {
		/* 자동 타입 변환
		//자식객체
		Child child = new Child();
		//부모한테 자식을 넣어줌
		Parent parent = child; //자동 타입 변환
		
		parent.method1();
		parent.method2(); //자식 클래스에 ★오버라이드된 메소드를 불러온다.
//		parent.method3(); //★자식 객체에 있는 메소드는 불러오지 않는다.
		
		parent.a = 2; //부모필드는 불러옴
//		parent.b = 1; //자식 객체 있는 필드는 불러오지 못한다.
		
	*/
		Parent parent = new Child(); //자동 타입 변환
		
		//instanceof:객체타입 확인을 위한 자바에서 제공하는 연산자
		//parent가 Child객체를 갖고 있지 않으면 (강제 타입 변환) 할수 없으므로 확인 필요
		//parent매개변수가 Child클래스를 담고 있는지?
		if(parent instanceof Child) { //true

			Child child = (Child)parent; //강제 타입 변환
			child.b = 1; //자식객체에 있는 필드에 접근 가능
			System.out.println(child.b);
			child.method3(); //자식 객체에 있는 메소드에 접근 가능
			
		}
		
	}

}
