package test.ch06;

public class KoreaEX {

	public static void main(String[] args) {
		Korea k1 = new Korea("123456-1234567", "비비빅");
		k1.name = "메로나";
//		k1.nation = "미국"; final필드는 변경불가라 오류
		
		System.out.println(k1.name);
		System.out.println(k1.nation);
		System.out.println(k1.ssn);
	}

}
