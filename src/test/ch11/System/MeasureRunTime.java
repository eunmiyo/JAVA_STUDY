package test.ch11.System;

public class MeasureRunTime {

	public static void main(String[] args) {
		
		long time1 = System.nanoTime();
		
		int sum = 0;
		for(int i=0; i<=1000000; i++) {
			sum += i;
		}
		
		long time2 = System.nanoTime();
		
		System.out.println(sum);
		System.out.println(time2-time1 + "나노(초)시간이 소요되었습니다.");
		
	}

}
