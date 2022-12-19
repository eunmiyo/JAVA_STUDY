package test.ch01;

public class Example {

	public static void main(String[] args) {
		int num = 10;
		System.out.println(num > 0 ? "양수" : (num < 0 ? "음수" : 0));
		
		int[] arr = {10, 20, 30, 40, 50};
		int sum = 0;
		int avg = 0;
		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
			avg = sum/arr.length;	
		}
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);	
		
		int money = 2680;
		int[] coin = {500, 100, 50, 10};
		int[] result = new int [coin.length];
		for(int i=0; i< coin.length; i++) {
			result[i] += money / coin[i]; 
			money = money % coin[i]; 
		}
		
		for(int i=0; i<coin.length; i++) {
			if(i != coin.length-1) {
				System.out.print(coin[i] + "원" + result[i] + "개, ");
			} else {
				System.out.print(coin[i] + "원" + result[i] + "개, ");
			}
		}
		
		
		
	}

}
