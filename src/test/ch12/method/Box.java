package test.ch12.method;

/*
 * 제네릭 메소드
 * public<A, B ...> 리턴타입 메소드명(매개변수, ...){...}
 * 리턴타입, 메소드를 동시에 적용하므로 두개 의 타입은 일치해야한다!!
 */
public class Box<T> {
	private T t;
	
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}
}
