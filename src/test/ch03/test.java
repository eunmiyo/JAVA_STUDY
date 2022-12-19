package test.ch03;

public class test {

	public static void main(String[] args) {
		//1. 출력 결과 예상해보기
		int x = 10;
		int y = 20;
		int z = (++x) + (y--);
		System.out.println("1번답: " + z);
		System.out.println("------------");
		
		//2. 출력 결과 예상해보기
		int score = 85;
		String result = (!(score>90))? "가" : "나";
		System.out.println("2번답: " + result);
		System.out.println("------------");
		
		//3. 534자루 연필을 30명의 학생들에게 나누어 주고 남은 연필 수 구하기
		int pencils = 534;
		int students = 30;
		int pencilsPerStudent = (pencils % students);
		System.out.println("3번답 남은 연필수: " + pencilsPerStudent);
		
		int pencilsLef = (pencils / students);
		System.out.println("3번답 1인당 가진 연필수: " + pencilsLef);
		System.out.println("------------");
		
		//4. 356 십 이하자리 버리고 300 출력하기
		int value = 365;
		System.out.println("4번답: " + value / 100*100);
		System.out.println("------------");
		
		//5. 사다리꼴의 넓이 구하기
		int lengTop = 5;
		int lengthBottom = 10;
		int height = 7;
		double area = (lengTop + lengthBottom) * height/2.0;
		System.out.println("5번답: " + area);
		System.out.println("------------");
		
		//6. 비교연산자와 논리연산자 복합연산식 출력 결과 예상
		int x6 = 10;
		int y6 = 5;
		System.out.println("----6번답----");
		System.out.println((x6 > 7) && (y6 <= 5));
		System.out.println((x6 % 3 == 2) || (y6 % 2 != 1));
		System.out.println("------------");
		
		//7. %연산을 수행한 결과값에 10을 더하는 코드, NaN값을 검사해서 올바른 결과값 출력하기
		double x7 = 5.0;
		double y7 = 0.0;
		double z7 = 5 % y;
		
		System.out.println("----7번답----");
		if (Double.isNaN(z7)) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
			double result7 = z+10;
			System.out.println("결과: " + result7);			
		}
		System.out.println("------------");
		
		//8. 바구니 수 구하기
		int numOfApples = 123;
		int sizeOfBucket = 10;
		int numOfBucket = numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket > 0 ? 1 : 0);
		System.out.println("----8번답----");
		System.out.println("필요한 바구니의 수: " + numOfBucket);
		System.out.println("------------");
		
		//9. num값에 따라 양수, 음수, 0 출력 코드(삼항연사자이용)
		int num9 = 10;
		System.out.println("----9번답----");
		System.out.println(num9 > 0 ? "양수" : (num9 < 0 ? "음수" : 0));
		System.out.println("------------");
		
		//10. 일의 자리를 1로 바꾸는 코드
		int num = 333;
		System.out.println("----10번답----");
		System.out.println(num/10*10+1);
		System.out.println("------------");
		
		//11. 화씨를 섭씨로 변환하는 코드 변환공식: C=5/9*(F-32), 소수점 셋째자리 반올림
			int fahrenheit = 100;
			float celcius = (int)((5/9f * (fahrenheit-32))*100 + 0.5)/100f ;
			System.out.println("----11번답----");
			System.out.println("fahrenheit: " + fahrenheit);
			System.out.println("Celcius: " + celcius);
			System.out.println("------------");	
			
		//12. 코드 수정 후 실행 결과 얻기
			byte a12 = 10;
			byte b12 = 20;
			byte c12 = (byte)(a12 + b12);
			
			char ch12 = 'A';
			ch12 = (char)(ch12 + 2);
			
			float f = 3/2f;
			long l = 3000*3000*3000L;
			float f2 = 0.1f;
			
			double d = 0.1;
			boolean result12 = (float)d ==f2;
			
			System.out.println("----12번답----");
			System.out.println("C= " + c12);
			System.out.println("ch= " + ch12);
			System.out.println("f= " + f);
			System.out.println("l= " + l);
			System.out.println("result= " + result12);
			System.out.println("------------");	
			
		//13. 문자형 변수ch13가 영문자(대소문자)이거나 숫자 일때만 true가 되도록 하는 코드 작성
			char ch13 = 'z';
			boolean b13 = ('a' <= ch13 && ch13 <= 'z') || ('A' <= ch13 && ch13 <= 'Z') || ('0' <= ch13 && ch13 <= '9');
			System.out.println("----13번답----");
			System.out.println(b13);
			System.out.println("------------");	
			
		//14. 대문자를 소문자로 변경하는 코드
			char ch14 = 'A';
			char lowerCase = ('A' <= ch14 && ch14 <= 'Z') ? (char)(ch14+32) : ch14;
			System.out.println("----14번답----");
			System.out.println("ch14: " + ch14);
			System.out.println("ch14 to lowerCase: " + lowerCase);
			System.out.println("------------");	
			
	}

}
