package test.ch10.test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateOpEx2 {

	public static void main(String[] args) {
		//데이터 포맷 형식
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년MM월dd일 aHH:mm:ss");
		
		//22년 1월 1일 0시 0분 0초
		LocalDateTime startDateTime = LocalDateTime.of(2022, 1, 1, 0, 0, 0);
		System.out.println("시작일: " + startDateTime.format(dtf));
		
		//22년 12월 31일 0시 0분 0초
		LocalDateTime endDateTime = LocalDateTime.of(2022, 12, 31, 0, 0, 0);
		System.out.println("종료일: " +endDateTime.format(dtf));
		
		//isBefore(): 이전날짜인지?
		//isEqual(): 같은날짜인지?
		//isAfter(): 이후날짜인지?
		if(startDateTime.isBefore(endDateTime)) {
			System.out.println("진행 중입니다.");
		} else if(startDateTime.isEqual(endDateTime)) {
			System.out.println("종료합니다.");
		} else if(startDateTime.isAfter(endDateTime)) {
			System.out.println("종료했습니다.");
		}
	}

}
