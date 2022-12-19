package test.ch01;

public class Hello {

	public static void main(String[] args) {
		int var1 = 0b1011; //2진수
		int var2 = 0206; //8진수
		int var3 = 365; //10진수
		int var4 = 0xB3; //16진수
		long var5 = 100000000000000l;
		long var6 = 100000000000000L;
		char c1 = 'A'; //작은따옴표, 문자 1개
		char c2 = 65; //유니코드 "A"
		char c3 = 44032; //유니코드 "가"
		
		float var7 = 0.1234567894F;
		float var8 = 0.1234567894f;
		double var9 = 0.1234567894;
		
		double var10 = 5e2; // 5.0 * 10^2
		double var11 = 0.12E-2; //0.12 * 10^-2
		float var12 = 3e6f; //3.0 * 10^6
		
		boolean stop = true;
		
		int x = 10;
		boolean result = (x == 20);
		
		if (stop) {
			System.out.println("정지합니다");
		}
		
		String name = "나는 \"전은미\" 입니다";
		String name1 = "나는 \n전은미\n입니다"; //줄바꿈
		String name2 = "나는 \t전은미\t 입니다"; //tab키
		String one = "A"; //큰 따옴표, 문자 1개 혹은 여러개
		
		//10진수 출력
		System.out.println(var1 + ":" + var2 + ":" + var3 + ":" + var4);
		System.out.println(var6);
		System.out.println(c1 + ", " + c2 + ", " + c3);
		System.out.println(var7 + ", " + var9);
		System.out.println(var10 + ", " + var11 + ", " + var12);
		System.out.println(result);
		System.out.println(stop);
		System.out.println(name);
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(one);
	}

}

// TODO Auto-generated method stub
//System.out.println("hello! java!");

// 리터럴: 10, 사용자가 직접 입력한 값
// int a : 변수선언
//int a = 10; 

// 문장 끝 ; 반드시!

// 실행버튼을 눌렀을 때 main안에 있는 내용이 제일 먼저 실행

// 한줄 주석 (ctrl + /)

/* 여러줄 주석
  주석
  주석
   */

/**
 * 설명이 길어질 때
 * api 도큐먼트 작성할 때
 * 
*/

