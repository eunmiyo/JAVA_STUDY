package test.ch08.test;

public class TV5 implements Remocon5{

		
	@Override
	public void powerOn() {
		System.out.println("TV를 켰습니다.");	
	}

	public static void main(String[] args) {
		Remocon5 r = new TV5();
		r.powerOn();

	}

}
