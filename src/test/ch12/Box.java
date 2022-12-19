package test.ch12;

/*
 * 제네릭 정의
 * 결정되지 않은 타입을 파라메터로 처리하고,
 * 실제 사용할 때 파라메터를 구체적 타입으로 대체시키는 기능
 * <T>: 타입 파라메터, 타입이 필요한 자리에 T를 사용할 수 있다. 
 * <int>가 올 수 없는 이유: 
 * 타입파라미터를 대체하는 타입은클래스나 인터페이스다.
 * <Integer> <String>
 */
public class Box<T> {
	//content필드의 타입이 어떤게 올지 모른다.
	public T content;
}
