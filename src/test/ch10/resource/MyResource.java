package test.ch10.resource;

//AutoCloseable: 리소스를 자동으로 닫아주는 기능을 사용하기 위해 쓰는 인터페이스
public class MyResource implements AutoCloseable{
	//필드
	private String name;
	
	//생성자
	public MyResource(String name) {
		this.name = name;
		System.out.println("MyResource " + name + " 열기"); //매개변수name
	}
	
	//메소드
	public String read1() {
		System.out.println("MyResource " + name + " 읽기"); //필드name
		return "100" ;
	}
	public String read2() {
		System.out.println("MyResource " + name + " 읽기");
		return "abc";
	}

	//인터페이스 메소드 구현 필요
	@Override
	public void close() throws Exception { //닫아주는 메소드
		//파일 닫을 때 실행하고 싶은 코드 작성
		System.out.println("MyResource " + name + " 닫기");
	}
}
