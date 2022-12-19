package test.ch08;

//파일이름과 동일한 이름의 클래스에서만 public접근제한자를 붙일 수 있다.
public class RemoteControlEx {

	public static void main(String[] args) {
		//rc 변수에 RemoteControl 객체를 사용하겠다는 객체 선언
		RemoteControl rc;
		
		
		//Television객체를 rc변수에 대입
		rc = new Television();
		
		
		rc.turnOn(); //.(도트연산자)을 이용해 rc변수와 turnOn()메소드를 사용, turnOn()호출
		//Television객체에서 오버라이딩된 setVolume이 실행
		rc.setVolume(5);
		
		rc.setMute(true);
		rc.setMute(false);
		
		System.out.println("============");
		
		
		rc = new Audio(); //Audio객체를 rc변수에 대입
		rc.turnOn(); //turnOn()메소드 호출
		rc.setVolume(5); //Audio객체에 오버라이드된 setVolume메소드 실행
		
		rc.setMute(true);
		rc.setMute(false);
		
		RemoteControl.changeBattery(); //RemoteControl객체에서 changeBattery()메소드를 호출
		
		/*
		RemoteControl rc;
		
		//같은 RemoteControl상속받아서 가능!
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		rc = new Audio(); //오디오로 교체
		rc.turnOn();	
		rc.setVolume(5);
		rc.turnOff();
		
		//static특성을 가졌기 때문에 객체를 생성하지 않고 호출한다.
		System.out.println(RemoteControl.MAX_VOLUME);
		System.out.println(RemoteControl.MIN_VOLUME);
		*/
		
		/*
		RemoteControl rc = new Television();
		rc.turnOn();
		
		RemoteControl rc2 = new Audio();
		rc2.turnOn();
		 */
		
	}

}
