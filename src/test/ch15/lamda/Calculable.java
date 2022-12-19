package test.ch15.lamda;
/*
 * @FunctionalInterface
 * 함수형 인터페이스 
 * 컴파일과정에서 추상메소드가 하나인지 검사
 */
@FunctionalInterface
public interface Calculable {
//	void calculate(int x, int y); //추상메소드
//	void calculate(int x);
	void calculate(); //매개변수가 없는 메소드
}
