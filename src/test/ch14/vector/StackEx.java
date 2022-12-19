package test.ch14.vector;

import java.util.Stack;

public class StackEx {
/*
 * Stack(LIFO-Last In First Out)
 * -> 후입선출, 나중에 넣은 객체가 먼저 빠져나간다.
 */
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<>();
		
		//동전넣기
		//push(): 넣기
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		/*
		 * 동전 꺼내기
		 * isEmpty() 비어있는지 확인 
		 * true: 비어있다, false: 비어있지 않다
		 * pop(): 빼기
		 */
		
		while(!coinBox.isEmpty()) { //비어있지 않다면 반복
			Coin coin = coinBox.pop(); // 가져오기
			System.out.println("꺼내온 동전: " + coin.getValue());
		}
	}

}
