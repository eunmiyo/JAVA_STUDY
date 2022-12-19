package test.ch11.String;

import java.util.StringTokenizer;

public class StringTokenEx {

	//StringTokenizer: 문자 구분
	//Token:내부데이터
	public static void main(String[] args) {
		String data1 = "둘리&또치,마이콜";	
		//정규 표현식 (|) 또는
		//-> & 또는 ,
		String[] arr = data1.split("&|,"); 
		for(String token : arr) {
			System.out.println(token);
		}
		
		System.out.println("===============");
		
		String data2 = "둘리/또치/마이콜";
		StringTokenizer st = new StringTokenizer(data2, "/");
		
		while(st.hasMoreTokens()) { //hasMoreTokens() 데이터가 있니?
			String token = st.nextToken(); //nextToken() 다음 데이터가 있니?
			System.out.println(token);
		}

	}

}
