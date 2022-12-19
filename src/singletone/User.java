package singletone;

public class User {
	//필드
	private String name; //사용자 이름
	
	public User(String name) {
		this.name = name;
	}
	
	public void print() {
		Printer printer = Printer.getPrinter();
		//printer.toString(Object obj):객체의 주소를 출력
		System.out.println(this.name + "사용자가 사용하는 프린트: " + printer.toString());
	}
}
