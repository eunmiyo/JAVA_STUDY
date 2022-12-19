package test.ch11.test;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class SimpleDateFormatEx {

	public static void main(String[] args) {
		
		//현재 시간과 날짜 가져오기
		Calendar now = Calendar.getInstance();
		
		//요일은 1(일)~7(토) 숫자로 나오기 때문에 
		//문자로 나오기 위해 switch문으로 구현
		int week = now.get(Calendar.DAY_OF_WEEK);
		
		String strWeek = null;
		
		switch(week) {
		case Calendar.MONDAY : strWeek = "월요일"; break;
		case Calendar.TUESDAY : strWeek = "화요일"; break;
		case Calendar.WEDNESDAY : strWeek = "수요일"; break;
		case Calendar.THURSDAY : strWeek = "목요일"; break;
		case Calendar.FRIDAY : strWeek = "금요일"; break;
		case Calendar.SATURDAY : strWeek = "토요일"; break;
		case Calendar.SUNDAY : strWeek = "일요일"; break;
		}
			
		//SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 " + strWeek + " HH시 mm분");
		String time = sdf.format(new Date());
		System.out.println(time);
				
	}

}
