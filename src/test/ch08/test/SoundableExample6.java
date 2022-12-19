package test.ch08.test;

public class SoundableExample6 {
	//printSound(Soundable6 soundable6)
	//-> 매개변수 타입으로 Soundable6인터페이스를 가진다.
	public static void printSound(Soundable6 soundable6) {
		System.out.println(soundable6.sound());
//		soundable6.sound();
	}
	
	public static void main(String[] args) {		
		
		printSound(new Cat6());
		printSound(new Dog6());

	}
	

}
