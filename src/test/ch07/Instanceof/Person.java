package test.ch07.Instanceof;

//부모클래스
public class Person {
	//필드
	public String name;
	
	//생성자
	public Person(String name) {
		this.name = name;
	}
	
	public Person() {
		
	}
	
	//메소드
	public void walk() {
		System.out.println("걷습니다.");
	}
}
