package test.ch10.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateOpEx {

	public static void main(String[] args) {
		//LocalDateTime: 시간,날짜 연산
		
		LocalDateTime now = LocalDateTime.now(); //현재시간, 날짜
		
		//DateTimeFormatter: 원하는 모양으로 날짜, 시간 변경
		//ofPattern(String Pattern)
		//format(Formatter)
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년MM월dd일 aHH:mm:ss");
		System.out.println("현재시간: " + now.format(dtf));
		
		LocalDateTime result1 = now.plusYears(1); //1년더함
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy년MM월dd일 aHH:mm:ss");
		System.out.println(result1.format(dtf2));
		
		LocalDateTime result2 = now.minusMonths(2); //2월뺌
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("yyyy년MM월dd일 aHH:mm:ss");
		System.out.println(result2.format(dtf3));
		
		LocalDateTime result3 = now.plusDays(7); //7일후
		DateTimeFormatter dtf4 = DateTimeFormatter.ofPattern("yyyy년MM월dd일 aHH:mm:ss");
		System.out.println(result3.format(dtf4));
		
		
	}

}
