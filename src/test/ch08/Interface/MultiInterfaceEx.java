package test.ch08.Interface;

public class MultiInterfaceEx {

	public static void main(String[] args) {
		RemoteControl rc;
		
		rc = new SmartTelevision(); //자동형 변환
		rc.turnOn();
		rc.turnOff();
		
		Searchable searchable = new SmartTelevision();
		searchable.search("www.google.com");
		

	}

}
