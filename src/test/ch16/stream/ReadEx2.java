package test.ch16.stream;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadEx2 {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:/Temp/test2.db");
			
			/*
			 * read(byte[] b)
			 * 읽은 바이트를 매개값으로 주어진 배열에 저장 후 읽은 바이트 수를 리턴
			 */
			byte[] data = new byte[100];
			
			while (true) {
				//최대 100byte를 읽는다., 읽은 수는 리턴, data에 읽은 내용 저장
				int num = is.read(data);
				
				if(num == -1) break; //파일 끝에 도달했을 때
				
				for(int i=0; i<num; i++) {
					System.out.println(data[i]);
				}
			}
			
			is.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
