package test.ch11.Object;

// public class Member extends Object 생략되어있음 
// Object:자바 클래스의 최상위 클래스
public class Member { 
	//필드
	public String id;
	
	//생성자
	public Member(String id) {
		this.id = id;
	}

	//논리적 동등 만들기
	@Override
	public boolean equals(Object obj) {
		//instanceof: 강제형변환을 하기위해 검사
		//obj변수에 Member객체를 갖고있니?
		if(obj instanceof Member) { 
			//강제형변환: 자식객체에 있는 필드를 가져오기 위해
			Member target = (Member)obj;
			
			//여기서의 equals은 순순하게 String타입의 문자값을 비교
			if(id.equals(target.id)) {
				return true;
			}
		}
		return false;
	}
	
	
	
}

/**
	public static void main(String[] args) {

		Object obj1 = new Object();
		Object obj2 = obj1;
		
		System.out.println(obj1.equals(obj2)); //번지수를 비교
		System.out.println(obj1 == obj2); //번지수를 비교
		
		String a = "1";
		String b = "2";
		
		if(a == b); //x 주소를 비교
		if(a.equals(b)); //o 값을 비교
		
		//논리적 동등: 같은 객체든 다른 객체든 객체 저장 데이터가 동일하다.

	}
 */