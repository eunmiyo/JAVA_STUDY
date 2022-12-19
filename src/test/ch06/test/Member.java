package test.ch06.test;

public class Member {
	//필드
	String name;
	String id;
	String password;
	int age;

	//생성자
	Member(String name, String id){
		this.name = name;
		this.id = id; 	
	}	
	
	public static void main(String[] args) {
		Member user1 = new Member("홍길동", "hong");
		
		System.out.println(user1.name);
		System.out.println(user1.id);
		
	}

}