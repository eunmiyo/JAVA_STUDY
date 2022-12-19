package test.ch11.String;

public class StringBuilderEx {

	//StringBuilder: 문자열 조작 기능
	public static void main(String[] args) {
		String data = new StringBuilder()
		.append("DEF") //문자열 끝에 추가
		.insert(0, "abc") // 문자열 지정위치에 넣어준다(인덱스 번호로 위치, 문자열)
		.delete(3, 4) //문자열 일부를 삭제(시작위치 인덱스번호, 끝위치 인덱스번호)
		.toString(); //완성된 문자열을 String타입으로 리턴
		System.out.println(data);

	}

}
