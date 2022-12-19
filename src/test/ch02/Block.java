package test.ch02;

public class Block {

	public static void main(String[] args) {
		
		int v1 = 15;
		//if{} 안에서는 바깥변수 v1 접근 가능
		if (v1 > 10) {
			int v2 = v1 - 10;
		}
		int v3 = v1 + 5;
		// v2는 if{} 블록 안에 있어서 밖에서 사용 불가

	}

}
