package test.ch11.String;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class ByteToStringEx {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String data = "자바";
		data = data + "ans";
		
		//인코딩 -> 컴퓨터가 읽을 수 있도록 바꿔준다
		byte[] arr1 = data.getBytes("UTF-8"); //UTF-8로 인코딩 (UTF-8가 디폴트)
		System.out.println(Arrays.toString(arr1)); //배열을 문자열로 바꾼다.
	
		//디코딩 -> 사용자가 읽을 수 있도록 바꿔준다
		String str1 = new String(arr1, "UTF-8"); //UTF-8로 디코딩
		System.out.println(str1); //배열을 문자열로 바꾼다
	}

}

/**
 * 객체를 생성할 때마다 이전에 쓰던 객체는
 * 가비지컬렉터가 수거해감.
 */