package test.ch11.test;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		String str = "아이디,이름,패스워드";
		
		StringTokenizer token = new StringTokenizer(str, ",");
		
		while(token.hasMoreElements()) {
			String st = token.nextToken();
			System.out.println(st);
		}
		
	}

}
