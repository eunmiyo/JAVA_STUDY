package test.ch11.Math;

import java.util.Random;

public class RandomEx2 {

	public static void main(String[] args) {
		
		//Random(), import필요!
		Random rand = new Random();
		
		for(int i=0; i<=5; i++) {
			//nextInt(n): 0 ~ n(숫자)이전까지의 숫자를 랜덤으로 출력
			System.out.print(rand.nextInt(46) + ",");
		}
		
		System.out.println("");
		
		//Random(long seed): 같은 숫자를 출력
		Random rand2 = new Random(100); //seed를 넣어줌
		for(int i=0; i<=5; i++) {
			System.out.print(rand2.nextInt(46) + ",");
		}

	}

}
