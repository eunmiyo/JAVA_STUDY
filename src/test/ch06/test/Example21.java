package test.ch06.test;

public class Example21 {

	public static int max (int[] arr) {
		//만일 주어진 배열이 null이거나 크기가 0인 경우, -999999를 반환
		if(arr == null || arr.length == 0) return -999999;
		
		//최대값:하나씩 비교
		int max = 0;
		for(int i=0; i<arr.length; i++) {	
			if(max < arr[i]) {
				 max = arr[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		
		int[] data = {3, 2, 9, 10, 7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:" + max(data));
		System.out.println("최대값:" + max(null));
		System.out.println("최대값:" + max(new int[]{})); // 크기가 0인배열
	}

}
