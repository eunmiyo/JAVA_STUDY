package test.ch10;

public class ExceptionEx3 {

	public static void main(String[] args) {
		String[] array = {"100", "1ㅇㅇ", null, "200"};
		
		for(int i=0; i<=array.length; i++) {
			try {
				int value = Integer.parseInt(array[i]);//int로 형변환
				System.out.println("array[" + i + "]:" + value);
			} catch(ArrayIndexOutOfBoundsException e) { //ctrl+space
				e.printStackTrace();
			} catch(NullPointerException | NumberFormatException e) { 
			//2가지 이상의 예외를 동일하게 처리 |
				System.out.println("데이터에 문제가 있음: " + e.getMessage());				
			}
		}
	}
}

/**
 * 예외가 발생하면 catch블록은 위에서 부터 차례대로 검사
 * 상위클래스가 먼저 검사 대상이 되면 안됨
 * catch(ArrayIndexOutOfBoundsException e)
 * catch(Exception e) 가능
 * 
 * catch(Exception e)
 * catch(ArrayIndexOutOfBoundsException e)불가능
 */