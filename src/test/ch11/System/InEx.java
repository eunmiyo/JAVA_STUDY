package test.ch11.System;

import java.io.IOException;

public class InEx {

	//IOException: 입출력할때 뜨는 에러
	//main에서 throws해주면 자바에서 알아서 처리
	public static void main(String[] args) throws IOException {
		int speed = 0;
		int keycode = 0;
		
		while(true) {
			//enter키를 읽지 않았을 때 실행하는 코드 작성
			if(keycode != 13 && keycode != 10) { //13: enter키
				if(keycode == 49) {// 49: 숫자1키
					speed++;
				} else if (keycode == 50) { //50: 숫자2키
					speed--;
				}else if (keycode == 51) {//51: 숫자3키
					break; //while문 나옴
				}
				System.out.println("+---------------------+");
				System.out.println("|1.증속 | 2.감속 | 3.중지| ");
				System.out.println("+---------------------+");
				System.out.println("현재속도 = " + speed);
				System.out.print("선택 ->");
			}
			keycode = System.in.read(); //키를 하나씩 읽음
		}
		
		System.out.println("프로그램 종료");

	}

}
