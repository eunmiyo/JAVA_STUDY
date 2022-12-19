package test.ch11.Object;

public class EqualsEx {

	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		//처음엔 번지수를 비교해서 다릅니다.를 출력하지만
		//논리적 동등을 만들어 
		//-> 객체의 주소와 상관없이 필드의 값으로 비교
		if(obj1.equals(obj2)) { 
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");			
		}
		
		if(obj1.equals(obj3)) { //순수하게 값을 비교
			System.out.println("같습니다.");
		} else {
			System.out.println("다릅니다.");			
		}
	}

}
