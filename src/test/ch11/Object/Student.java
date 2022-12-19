package test.ch11.Object;

public class Student {
	//필드
	private int no;
	private String name;
	
	//생성자
	public Student(int no, String name) {
		this.no = no; //필드에 초기값 할당
		this.name = name;
	}
	
	//메소드
	public int getNo() {
		return no;
	}
	
	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		System.out.println("no: " + no + " name: " + name.hashCode());
		
		//번호와 이름이 같으면 동일한 hashCode가 생성된다.
		int hashCode = no + name.hashCode();
		return hashCode;
	}

	@Override
	public boolean equals(Object obj) {
		//obj가 Student객체를 가지고 있니?
		if(obj instanceof Student) {
			Student target = (Student)obj; //강제형변환
			
			//no하고 name의 값이 같은지 비교
			//String의 equals 사용
			if(no == target.getNo() && name.equals(target.getName())) {
				return true;				
			}
		}
		return false;
	}
	
}
