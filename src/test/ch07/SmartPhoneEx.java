package test.ch07;

public class SmartPhoneEx {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("아이폰", "시에라블루");
		
		//Phone에서 상속받은 필드 읽기: 자식 객체에도 부모 필드에 접근 가능
		System.out.println(myPhone.model + "," + myPhone.color);

		//Phone에서 상속받은 메소드: 자식 객체에서도 부모 메소드 접근 가능
		myPhone.bell();
		myPhone.sendVoice("여보세요");
		myPhone.receiveVoice("네 누구세요?");
		myPhone.hangup();
		
		myPhone.setWifi(false);
		System.out.println(myPhone.wifi);
	}

}
