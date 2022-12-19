package test.ch16.stream;

import java.io.FileOutputStream;

public class WriteEx {
	/*
	 * 바이트 출력 스트림
	 * OutputStream 바이트 출력 스트림의 최상위 클래스(추상클래스)
	 * FileOutputStream
	 * PrintStream
	 * BufferedOutputStream
	 * DataOutputStream
	 */

	public static void main(String[] args) {
		//FileOutputStream 출력 스트림
		
		try {
			FileOutputStream fo = new FileOutputStream("C:/Temp/test1.db"); //파일을 만든다.
			byte a =10;
			byte b =20;
			byte c =30;
			
			/*
			 * write(int a): 1byte출력
			 * 버퍼에 모아 놓는다.
			 * 매개변수가 int지만 4byte씩 출력하지 않고
			 * -> 1byte씩 출력!
			 * 더 이상 읽을 수 없다면 -1을 리턴
			 */
			fo.write(a); 
			fo.write(b);
			fo.write(c);
			
			/*
			 * flush(): 바이트를 비움
			 * 버퍼에 있는 모든 바이트를 출력하고 버퍼를 비움
			 * test1.db에 작성된다.
			 */
			fo.flush();
			
			/*
			 * close(): 출력 스트림을 닫음
			 * 출력 스트림은 반드시 닫아서 사용한 메모리를 해제
			 */
			fo.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
