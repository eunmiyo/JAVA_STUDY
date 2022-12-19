package test.ch11.Format;

import java.util.regex.Pattern;

public class PatterEx {

	public static void main(String[] args) {
		/**
		 * 02-222-2222
		 * 010-2222-2222
		 * "(010|02) 010 또는 02
		 * - \d 한개의 숫자 0-9와 동일 
		 * {3, 4}" {n,m} n개부터 m개까지
		 * {4} {n} 정확히 n개, {n,} n개부터
		 * {} 그룹핑
		 * String에서 \인식을 잘 못해서 \\두개 붙임
		 */
		String regExp = "(010|02)-\\d{3,4}-\\d{4}"; //패턴을 넣을 문자열, 전화번호 체크
		String data = "010-123-4567";
		
		//matches(regExp, data) : ("내가 정한 패턴, 검증하고싶은 데이터)
		boolean result = Pattern.matches(regExp, data);
		System.out.println(result);
		
		// 인식을 위해 \\하나 더 붙여줌
		//-> \n \t 또 다른 정규식이 있어서
		regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		data = "test@naver.com";
		
		result = Pattern.matches(regExp, data);
		
	}

}
