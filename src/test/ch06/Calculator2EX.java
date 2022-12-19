package test.ch06;

public class Calculator2EX {

	public static void main(String[] args) {
		//인스턴스를 생성(객체 생성이랑 비슷)
		//Calculator2 calc2 = new Calculator2();
		
		//인스턴스를 통해서만 실행, 인스턴스 멤버
		//calc2.plus(1, 2);
		
		//인스턴스를 생성하지 않아도 클래스를 통해 접근 가능, static(정적)을 붙여서! 가능 
		Calculator2.plus(1, 2);
		Calculator2.minus(1, 2);
		System.out.println(Calculator2.pi);
	}

}
