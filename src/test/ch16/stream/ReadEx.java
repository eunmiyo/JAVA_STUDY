package test.ch16.stream;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadEx {
	/*
	 * 바이트 입력 스트림 InputStream 바이트 입력 스트림의 최상위 클래스(추상클래스) FileInputStream
	 * BufferedInputStream DataInputStream
	 */

	public static void main(String[] args) {
		/*
		 * read(int b)
		 * 매개변수가 int여도 4byte씩 입력하지 않고
		 * -> 1byte씩 입력
		 * 더 이상 읽을 수 없다면 -1을 리턴
		 */
		try {
			InputStream is = new FileInputStream("C:/Temp/test1.db");
			while (true) {
				int data = is.read(); //1byte씩 읽기
				
				if(data == -1) break; //파일 끝에 도달했을 때
				
				System.out.println(data);
			}
			
			is.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
