package test.ch03;

public class ConditinalOperator {

	public static void main(String[] args) {
		//삼항연산자 조건식? 결과1(참):결과2(거짓)
		
		int score = 85;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B': 'C');
		System.out.println(score + "점은 " + grade + "등급 입니다.");
	}

}
