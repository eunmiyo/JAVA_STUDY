package test.ch11.Math;

public class RandomEx {

	public static void main(String[] args) {
		
		//Math.random(): 0.0 ~ 1.0 사이의 숫자 출력
		//소수, double타입
		System.out.println(Math.random());
		
		System.out.println("================");
		
		int n = 9; //n개의 정수(내가 얻고싶은 정수의 갯수)
		int start = 1; //시작하는 숫자
		int num = (int) (Math.random() * n) + start;
		System.out.println(num);

	}

}
