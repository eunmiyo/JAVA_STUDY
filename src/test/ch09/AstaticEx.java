package test.ch09;

public class AstaticEx {

	public static void main(String[] args) {
		//외부에서 접근 할 때
		//A객체를 생성하지 않아도 B객체를 생성할 수 있다.
		//Astatic.으로 접근 가능
		
		Astatic.B b = new Astatic.B(); //생성자 접근
		
		System.out.println(b.field1); //필드 접근
		b.method1(); //메소드 접근
		

	}

}
