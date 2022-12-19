package test.temp;

/**
 * 싱글톤 패턴 (디자인 패턴의 한 종류)
 * @author choco
 *
 */
public class S01 {
	private static S01 singleton = null;
	
	private S01() {
		
	}
	
	public static S01 getInstatnce() {
		if (null == singleton) {
			singleton = new S01();
		}
		
		return singleton;
	}
}
