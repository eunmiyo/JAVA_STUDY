package test.ch10.test;

public class FileWriterExample {

	public static void main(String[] args) {
		try(FileWriter fw = new FileWriter("file.txt")) {
			fw.write("Java"); //자바를 파일에 저장합니다
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}  
		
	}
}

