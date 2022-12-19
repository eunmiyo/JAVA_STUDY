package test.ch16.stream;

import java.io.FileOutputStream;

public class WriteEx2 {

	public static void main(String[] args) {
		//FileOutputStream 출력 스트림
		
		try {
			FileOutputStream fo = new FileOutputStream("C:/Temp/test2.db"); //파일을 만든다.
			
			byte[] array = {10, 20, 30};
			
			/*
			 * write(byte[] a): 1byte출력
			 * 매개값으로 주어진 배열 a의 모든 바이트를 출력
			 */
			fo.write(array); 

			fo.flush(); //비움, 실제 작성됨
			
			fo.close(); //닫음
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
