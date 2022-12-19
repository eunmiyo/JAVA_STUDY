package test.ch08.Interface_extends;

public class InterfaceCImpl implements InterfaceC{
	//추상메소드는 무조건 구현 해주어야 함
	
	@Override
	public void methodA() {
		System.out.println("InterfaceCImpl methodA() 실행");
	}

	@Override
	public void methodB() {
		System.out.println("InterfaceCImpl methodB() 실행");
		
	}

	@Override
	public void methodC() {
		System.out.println("InterfaceCImpl methodC() 실행");
		
	}

}
