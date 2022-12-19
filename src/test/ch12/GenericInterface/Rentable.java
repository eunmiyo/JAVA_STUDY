package test.ch12.GenericInterface;

//결정되지 않은 타입을 파라미터로 가지는 인터페이스
public interface Rentable<P> {
	P rent(); //메소드의 리턴타입이 뭔지 모름
}
