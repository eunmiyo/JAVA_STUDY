package test.ch10.test;

//AutoCloseable: 리소스를 자동으로 닫아주는 기능을 사용하기 위해 쓰는 인터페이스
public class FileWriter implements AutoCloseable{
	//생성자
	public FileWriter(String filePath)  {
		System.out.println(filePath + " 파일을 엽니다.");
	}

	//메소드 
	public void write(String data)  {
		System.out.println(data + "를 파일에 저장합니다.");
	}

	//닫을 때 실현하는 메소드
	@Override
	public void close() throws Exception {
		System.out.println("파일을 닫습니다.");
		
	}
	
	
}
