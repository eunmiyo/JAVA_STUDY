package test.ch04;

import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {
		q1_1(19);
		//q1_2();
		//q1_3();
		//q1_4();
		//q1_5();
		//q1_6();
		//q1_7();
		//q1_8();
		//q2();
		//q3();
		//q4();
		//q5();
		//q6();
		//q7();
		//q8();
		//q9();
		//q10();
		//q11();
		//q12();
	}
	
	public static void q1_1(int x) {
		System.out.println("-----1-1번답-----");
		System.out.println("1-1. x가 10보다 크고 20보다 작을 때 true");
		System.out.println("x:" + x);
		System.out.println(x > 10 && x < 20);
	}
	
	public static void q1_2() {
		System.out.println("-----1-2번답-----");
		
		//1-2. ch가 공백이나 탭이 아닐 때 true
		char ch = 'a';
		boolean b2 = !(ch == ' ') || (ch == '\t');
		if (b2 == true) {
			System.out.println(b2);
		} else {
			System.out.println(b2);
		}	
	}
	
	public static void q1_3() {
		System.out.println("-----1-3번답-----");
		
		//1-3. char형 변수가 'x' 또는 'X' 일때 true
		char ch2 = 'x';
		boolean b3 = ch2 == 'x' || ch2 == 'X';
		if (b3 == true) {
			System.out.println(b3);
		} else {
			System.out.println(b3);
		}
	}
	
	public static void q1_4() {
		System.out.println("-----1-4번답-----");
		
		//1-4. char형 변수가 숫자(0-9)일 때 true
		char ch3 = 'a';
		boolean b4 = ch3>='0' && ch3<='9';
		if (b4 == true) {
			System.out.println(b4);
		} else {
			System.out.println(b4);
		}
	}
	
	public static void q1_5() {
		System.out.println("-----1-5번답-----");
		
		//1-5. char형 변수가 영문자(대문자 또는 소문자)일 때 true
		char ch4 = '3';
		boolean b5 = ('a' <= ch4 && ch4 <= 'z') || ('A' <= ch4 && ch4 <= 'Z');
		if (b5 == true) {
			System.out.println(b5);
		} else {
			System.out.println(b5);
		}
	}
	
	public static void q1_6() {
		System.out.println("-----1-6번답-----");
		
		//1-6. int형 변수가 400으로 나누어 떨어지거나 또는 4로 나누어 떨어지고, 100으로 나누어 떨어지지 않을 때 true
		int year = 1900;
		boolean b6 = (year%400==0) || (year%4==0) && (year%100!=0);
		if (b6 == true) {
			System.out.println(b6);
		} else {
			System.out.println(b6);
		}
	}
	
	public static void q1_7() {
		System.out.println("-----1-7번답-----");
		
		//1-7. boolean형 변수가 false일 때 true
		boolean powerOn = false;
		if (powerOn == false) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	public static void q1_8() {
		System.out.println("-----1-8번답-----");
		
		//1-8. 문자열 참조변수가 "yes"일 때 true
		String str = "yes";
		if (str.equals("yes")) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
	
	public static void q2() {
		System.out.println("-----2번답-----");
		
		//2. for문을 이용하여 1-100까지 정수 중 3의 배수 총합
		int sum = 0;
		for (int i=1, j=1; i<=100; i++) {
			if (i%3==0) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
	
	public static void q3() {
		System.out.println("-----3번답-----");
		
		//3. 1-20까지 정수 중 2또는 3의 배수가 아닌 수의 총합
		int sum2 = 0;
		for (int i=1; i<=20; i++) {
			if(i%2!=0 && i%3!=0) {
				sum2 += i;
			}
		}
		System.out.println(sum2);
	}

	public static void q4() {
		System.out.println("-----4번답-----");
		
		//4. while문과 Math.random()메소드를 이용, 두 개의 주사위를 던졌을 때
		//나오는 숫자를 출력, 합이 5가 아니면 계속, 합이 5이면 정지
		
		while(true) {
			int num1 = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;
			System.out.println("(" + num1 + "," + num2 + ")");
			if ((num1 + num2) == 5) {
				break;
			}
		}
	}
	
	public static void q5() {
		System.out.println("-----5번답-----");
		
		//5. 중첩for문을 이용 방정식 4x + 5y = 60인 모든 해를 구해서(x,y)로 출력
		// x와 y는 10이하의 자연수
		
		for(int X=1; X<=10; X++) {
			for(int Y=1; Y<=10; Y++) {
				if ((4*X) + (5*Y) == 60) {
					System.out.println("(" + X + "," + Y + ")");
				}			
			}
		}
	}
	
	public static void q6() {
		System.out.println("-----6번답-----");
		
		//6. 1+(-2)+3+(-4)...과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이 100이상이 되는 프로그램
		int sum6 = 0; //총합을 저장할 변수
		int s = 1; // 값의 부호를 바꿔주는데 사용할 변수
		int num6 = 0; 
		//조건식의 값이 true이므로 무한반복문이 된다.
		for(int i=1; true; i++, s = -s) { // 매 반복마다 s의 값은 1, -1, 1, -1...
			num6 = s * i; //i와 부호(s)를 곱해서 더할 값을 구한다.
			sum6 += num6;
			if (sum6 >= 100) {//총합이 100보다 같거나 크면 반복문을 빠져 나간다.
				break;
			}	
			System.out.println("num6= " + num6);
			System.out.println("총합= " + sum6);
		}
	}
	
	public static void q7() {
		System.out.println("-----7번답-----");
		
		//7. 두개의 주사위를 던졌을 때 합이 6이 되는 모든 경우의 수 출력(이중for문 이용)
		
		for (int q=1; q<=6; q++) {
			for(int w=1; w<=6; w++) {
				if ( q + w == 6 ) {
					System.out.println("(" + q + "," + w + ")");
				}
			}
		}
	}
	
	public static void q8() {
		System.out.println("-----8번답-----");
		
		//8. int형 각 자리의 합을 더한 결과 예) 12345라면, 1+2+3+4+5(문자변환금지)
		int num8 = 12345;
		int sum8 = 0;
		while (num8 > 0) {
			sum8 += num8 % 10;
			num8 /= 10;
		}
		System.out.println("각 자리의 합을 더한 결과: " + sum8);
	}
	
	public static void q9() {
		System.out.println("-----9번답-----");
		
		//9. 피보나치 수열(앞 두수를 더해서 다음 수를 만들어 나가는 수열)
		//예) 두 수가 1과 1이라면 그 다음수는 2가 되고 그 다움수는 1과 2를 더해서 3
		//예) 1,1,2,3,5,8,13,21.....
		// 1과 1부터 시작하는 피보나치수열의 10번째 수는 무엇?
		//Fibonnaci 수열의 시작 첫 두숫자는 1,1로 한다
		int a9 = 1;
		int b9 = 1;
		int c9 = 0; //3번재값
		System.out.println(a9 + "," + b9);
		for (int I = 0; I < 8; I++) {
			c9 = a9 + b9; //3번째 값은 첫번째와 두번째 더한 값을 더해서 얻는다.
			System.out.println("," + c9); // 세번째 수열 출력
			a9 = b9;
			b9 = c9;
		}
	}
	
	public static void q10() {
		System.out.println("-----10번답-----");
		
		//10. for문을 이용해 별 출력하기
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
	
	public static void q11() {
		System.out.println("-----11번답-----");
		
		//11. 숫자 맞추기 게임
		//1~100사이의 임의의 값을 얻어서 answer에 저장한다.
		int answer = (int) (Math.random()*100) + 1;
		int input = 0; // 사용자입력을 저장할 공간
		int count = 0; //시도횟수를 세기위한 변수
		//화면으로 부터 사용자입력을 받기 위해서 Scanner클래스 사용
		java.util.Scanner f11 = new java.util.Scanner(System.in);
		do {
			count++;
			System.out.print("1과 100사이의 값을 입력하세요: ");
			input = f11.nextInt(); //입력받은 값을 변수 input에 저장한다.
			if(answer > input) {
				System.out.println("더 큰 수를 입력하세요.");
			} else if (answer < input) {
				System.out.println("작은 수를 입력하세요.");
			} else {
				System.out.println("맞췄습니다.");
				System.out.println("시도횟수는 " + count + "번입니다.");
				break; //do-while문을 벗어난다.
			}
		}while (true); //무한반복문
	}
	
	public static void q12() {	
		System.out.println("-----12번답-----");
		
		//12. while문과 Scanner의 nextLine()메소드를 이용
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		while(run) {
			System.out.println("----------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------");
			System.out.println("선택> ");
			int menuNum = scanner.nextInt();
			switch (menuNum) {
			case 1:
				System.out.print("예금액> ");
				balance += scanner.nextInt();
				break;
			case 2:
				System.out.print("출금액> ");
				balance -= scanner.nextInt();
				break;
			case 3:
				System.out.print("잔고> ");
				System.out.println(balance);
				break;
			case 4:
				run = false;
				break;
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");	
	}

}
