package test.ch09;

public class ALocalEx {

	public static void main(String[] args) {
		//외부에서 B클래스 호출시
		ALocal a = new ALocal();
		
		//메소드 호출을 통해서 객체를 생성
		a.useB(1);

	}

}
