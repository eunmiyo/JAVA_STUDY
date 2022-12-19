package test.ch11.test;

public class MemberExample {

	public static void main(String[] args) {
		Member member = new Member("blue", "이파란");
		
		String obj = member.toString(); //toString: 특정 문자를 출력하고 싶을 때
		System.out.println(obj);

	}

}
