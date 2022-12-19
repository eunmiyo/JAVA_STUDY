package test.ch07.test;

public class Child extends Parent{
	
	/**
	public int studentNo;
	
	public Child(String name, int studentNo) {
		super(name); //parent부모생성자를 호출
		this.studentNo = studentNo;
	}
	*/
	
	public String name;
	
	public Child() { 
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}


	
	
}
