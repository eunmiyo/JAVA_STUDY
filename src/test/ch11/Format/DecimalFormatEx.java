package test.ch11.Format;

import java.text.DecimalFormat;

public class DecimalFormatEx {
// DecimalFormat: 숫자를 형식화된 문자열로 변환
	
	public static void main(String[] args) {
		double num = 1234567.89;
		
		DecimalFormat df;
		
		//"#,###" 정수
		df = new DecimalFormat("#,###"); //포맷을 정한다.
		System.out.println(df.format(num)); //포맷을 적용
		
		//"#,###.0" 소수점
		df = new DecimalFormat("#,###.0"); //포맷을 정한다.
		System.out.println(df.format(num)); //포맷을 적용
		
	}

}
