package test.ch11.reflection;

public class GetResourceEx {

	public static void main(String[] args) {
		Class clazz = Car.class;
		
		/*
		 * 리소스 경로 얻기
		 * getResource(String name): 리소스 파일의 URL리턴
		 * getResource("Dog.jpg")
		 * getResource("img/Cat.jpg")
		 * getPath() : 경로 가져오기
		 */
		String photo1Path = clazz.getResource("Dog.jpg").getPath();
		String photo2Path = clazz.getResource("img/Cat.jpg").getPath();
		
		System.out.println(photo1Path);
		System.out.println(photo2Path);
	
	}

}
