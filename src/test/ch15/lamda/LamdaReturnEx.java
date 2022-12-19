package test.ch15.lamda;

public class LamdaReturnEx {

	public static void main(String[] args) {
		Person person = new Person();
		person.action((x, y) -> {
			double result = x + y;
			return result;
		});
		
		//return문 하나만 있을 경우 중괄호와 return문 생략가능
		person.action((x,y) -> x - y);
		person.action((x,y) -> x * y);
		person.action((x,y) -> x % y); //나머지
		person.action((x,y) -> x / y); //몫

	}

}
