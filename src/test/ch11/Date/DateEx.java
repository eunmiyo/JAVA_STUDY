package test.ch11.Date;

import java.text.SimpleDateFormat;

// import java.util.*;  
//-> *로 바꿔주면 util안에 있는걸 다 가져온다!
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		//Date, import util로 선택
		Date now = new Date(); //현재 날짜와 시간 생성
		System.out.println(now);
		
		String strNow1 = now.toString(); //문자열로 변경
		System.out.println("문자열: " + strNow1);
		
		//SimpleDateFormat import 필요
		//SimpleDateFormat("yyyy-MM-dd HH시mm분ss초")
		//-> 글자는 맘대로
		//-> 포맷형태 객체 생성
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년MM월dd일 HH시mm분ss초");
		//Date객체를 넣어준다.
		String strNow2 = sdf.format(now);
		System.out.println(strNow2);
	}

}
