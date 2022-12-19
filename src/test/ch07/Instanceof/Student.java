package test.ch07.Instanceof;

public class Student extends Person{
	//필드(변수)
	public int studentNo; //학번
	
	/**
	 * 생성자
	 * 생성자는 반환형을 정의하지 않는다
	 * 생성자명은 클래스명과 동일하다
	 * 기본 생성자를 외부에서 사용하지 않도록 하기 위해서는 private 으로 선언하면 된다 (예: private Student() { })
	 * Overload 가능하다
	 * 
	 * @param name
	 * @param studentNo
	 */
	public Student(String name, int studentNo) {
		super(name); //Person부모생성자를 호출
		this.studentNo = studentNo;
	}
	
	//메소드 method
	public void study() {
		System.out.println("공부를 합니다.");
	}
}


