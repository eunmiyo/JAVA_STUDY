package test.temp;

public class Temp02 {
	public static String val1 = "당근";
	
	/**
	 * private 으로 기본 생성자를 변경하면
	 * 외부에서 기본 생성자로 객체를 생성하지 못하게 한다
	 */
	private Temp02() {
		
	}
	
	public Temp02(String val) {
		System.out.println("val : " + val); // sysout > ctrl + space > System.out.println();
	}
}
