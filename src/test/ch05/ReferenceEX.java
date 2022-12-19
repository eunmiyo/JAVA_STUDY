package test.ch05;

public class ReferenceEX {

	public static void main(String[] args) {
		int[] scores = {95, 71, 84, 93, 87};
		int sum = 0;
		
		for(int score : scores) {
			System.out.println(score);
			sum += score;
		}
		System.out.println(sum);
		
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		
		//배열 복사 -> 배열의 크기를 늘려줌
		for (int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		//System.arraycopy(원본배열, 원본배열 복사시작 인덱스, 새 배열, 새배열 붙여넣기 시작 인덱스, 복사 항목 수)
		System.arraycopy(oldIntArray, 0, newIntArray, 0, oldIntArray.length);
		
		for (int i=0; i<newIntArray.length; i++) {
			System.out.print(newIntArray[i] + ", ");
		}
		
		/*
		String[] strArray = new String[3];
		strArray[0] = "java";
		strArray[1] = "java";
		strArray[2] = new String("java");
		
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0] == strArray[2]);
		System.out.println(strArray[0].equals(strArray[2]));
		*/	
		
		/*
		int[] arr1;
		int[] arr2;
		int[] arr3;

		arr1 = new int[] {1, 2, 3};
		arr2 = new int[] {1, 2, 3};
		arr3 = arr2; //arr2주소를 arr3에게 넘겨준다.
		
		System.out.println(arr1 == arr2); //주소 비교
		System.out.println(arr2 == arr3);
		
		int[] intArray = null;
		intArray[0] = 10;
		*/
	}

}
