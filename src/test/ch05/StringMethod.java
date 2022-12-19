package test.ch05;

public class StringMethod {

	public static void main(String[] args) {
		String board = "1,자바 학습,참조 타입String 공부중";
		
		String[] tokens = board.split(","); //배열
		
		for(int i=0; i<tokens.length; i++) {
			System.out.println(tokens[i]);
		}
		
		
		/*
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("파");
		//indexOf("프로그래밍")으로 프가 시작하는 인덱스번호를 출력, 공백도 포함
		System.out.println(location);
		
//		String substring = subject.substring(location);
//		//프로 시작하는 단어 출력
//		System.out.println(substring);
		
		if(location == -1) {
			System.out.println("해당 문자열이 없습니다.");
		}
		
		boolean result = subject.contains("자바");
		if(result) {
			System.out.println("자바와 관련된 책입니다.");
		} else {
			System.out.println("자바와 관련없는 책입니다.");
		}
		*/
		
		
		/*
		String ssn = "910515-2230123"; //주민번호
		String firstName = ssn.substring(0, 6); //인덱스 번호 0시작부터 6이전까지 출력
		System.out.println(firstName);
		
		String secondName = ssn.substring(7); //시작 인덱스번호부터 끝자리까지 출력
		System.out.println(secondName);
		*/
		
		
		/*
		String oldstr = "자바 문자열";
		String newstr = oldstr.replace("자바", "JAVA");
		
		System.out.println(oldstr);
		System.out.println(newstr);
		*/
		
		
		/*
		String ssn = "9105151230123"; //주민번호
		char sex = ssn.charAt(6); //(인덱스번호)
		int length = ssn.length();
		
		if (length == 13) {
			System.out.println("주민번호 자릿수가 맞습니다.");
		} else {
			System.out.println("주민번호 자릿수가 맞지 않습니다.");
		}
		
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;		
		}
		*/

	}

}
