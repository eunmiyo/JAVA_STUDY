package test.ch07.Abstract;

public class AbstractEx {

	public static void main(String[] args) {
		/*
		 Animal은 abstract클래스라서 인스턴스 생성할 수 없으므로
		 Animal an = new Animal();
		 -> 자동형변환을 해줘야 한다.
		 Animal an = new Dog();
		 */

		
		Dog dog = new Dog();
		dog.sound();
		
		Cat cat = new Cat();
		cat.sound();
		
		//매개변수의 다형성
		animalSound(dog);
		animalSound(cat);
	}
//	public static void animalSound(Animal animal = new Cat())
	public static void animalSound(Animal animal) {
		animal.sound();
	}
} 

