package test.ch11.Date;

import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		//Calendar import필요
		//현재 시간과 날짜를 가져온다.
		Calendar now = Calendar.getInstance();
		
		//get(int field)
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1; //월은 +1 해줘야함
		int day = now.get(Calendar.DAY_OF_MONTH); //일
		int week = now.get(Calendar.DAY_OF_WEEK);//요일 1(일)~7(토)
		
		System.out.println(year + "년");
		System.out.println(month+ "월");
		System.out.println(day+ "일");
		System.out.println(week+ "요일");
		
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
		
		System.out.println(strWeek);
		
		//am, pm인지 나타내준다. (0:am, 1:pm)
		int amPm = now.get(Calendar.AM_PM);
		System.out.println(Calendar.AM); //오전0
		System.out.println(Calendar.PM); //오후1
		
		System.out.println(amPm);
		
		if(amPm == Calendar.AM) {
			System.out.println("오전");
		} else {
			System.out.println("오후");	
		}
		
		//HOUR: 오전/오후 기준 (0 ~ 11)
		System.out.println(now.get(Calendar.HOUR) + "시," + now.get(Calendar.MINUTE) + "분," + now.get(Calendar.SECOND)+"초");
		
	}

}
