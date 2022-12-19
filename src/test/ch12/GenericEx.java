package test.ch12;

public class GenericEx {

	public static void main(String[] args) {
//		<>타입을 다 적어도 되고, 생성시에는 안적어도 됨
//		Box<String> box1 = new Box<String>();
		Box<String> box1 = new Box<>();
		
		//box1.content = 모든객체 대입 가능
		box1.content = "안녕하세요";
		String str = box1.content;
		System.out.println(str);
		
		Box<Integer> box2 = new Box<>();
		box2.content = 100;
		int val = box2.content;
		System.out.println(val);
	} 

}
