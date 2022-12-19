package test.ch08.Interface_extends;

//인터페이스끼리 상속을 받을 때는 extends!
public interface InterfaceC extends InterfaceA, InterfaceB{
	//추상메소드
	void methodC();
}
