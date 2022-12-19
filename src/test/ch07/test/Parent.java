package test.ch07.test;

public class Parent {
	
	/**
	public String name;
	
	public Parent(String name) {
		this.name = name;
	}
	*/
	
	//필드
	public String nation;
	
	//생성자
	public Parent() {
		this("대한민국");
		System.out.println("Parent() call");
	}
	
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
