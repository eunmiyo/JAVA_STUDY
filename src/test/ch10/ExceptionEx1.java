package test.ch10;

public class ExceptionEx1 {

	//일반예외: 컴파일러가 예외처리 코드 여부를 검사
	//try{} catch{} 반드시 필요!
	public static void printLength(String data) {
		try { //실행시킬 코드를 작성
			int result = data.length(); //글자갯수를 가져옴
			System.out.println("문자 수: " + result);
			
			//catch(Exception e)써도됨
		} catch(NullPointerException e) { //에러가 났을 때 실행시킬 코드를 작성
			//예외처리 정보를 얻는 세가지 방법
			
//			System.out.println(e.getMessage());//예외가 발생한 이유만 출력
//			System.out.println(e.toString());//예외가 발생한 이유 + 예외의 종류 출력
			e.printStackTrace();//예외가 발생한 이유 + 예외의 종류 + 예외가 발생한 곳 출력
			
		} finally { //finally:옵셔널하다, 마지막에 무조건 실행
			System.out.println("마무리 실행\n");
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작\n");
		printLength("ThisIsJava");
		printLength(null);
		System.out.println("프로그램 종료");
	}

}
