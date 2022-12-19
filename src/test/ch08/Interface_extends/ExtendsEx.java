package test.ch08.Interface_extends;

public class ExtendsEx {
	public static void main(String[] args) {
		InterfaceCImpl impl = new InterfaceCImpl();
		
		InterfaceA ia = impl; //자동형변환
		ia.methodA();
		
		InterfaceB ib = impl;
		ib.methodB();
		
		//InterfaceC는 extends로 InterfaceA, InterfaceB를
		//-> 상속받았기 때문에 호출 가능
		InterfaceC ic = impl;
		ic.methodC();
		ic.methodA();
		ic.methodB();
	}
}
