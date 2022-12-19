package test.ch07.Instanceof;

public class InstanceofEx {
	//static을 쓰면 객체를 생성하지 않아도 가져다 쓸 수 있음!
	public static void personInfo(Person person) { //자동타입변환 : 부모클래스 변수이름 = 자식클래스     Person person = Student
		System.out.println("name: " + person.name);
		person.walk();
		
		if (person instanceof Student) {//person이 Student객체를 갖고있니?
			Student student = (Student)person; //강제타입변환 : 자식클래스 변수이름 = (자식클래스) 부모클래스의변수이름
			student.study();
			System.out.println(student.studentNo);
		}
	}
	
	public static void main(String[] args) {
		// Person(클래스) p1(변수)
		Person p1 = new Person("전은미");
		
		//Person person = new Person("전은미")
		personInfo(p1);
		
		Person p2 = new Student("미미", 22);
		//Person person = new Student("전은미",22)
		p2.walk();
		personInfo(p2);
		
		Person p3 = new Person();
	}

}
