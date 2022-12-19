package test.temp;

public class TempRun {
	public static void main(String[] args) {
		//test1();
		test2(args);
	}
	
	public static void logSE(String val, boolean isStart) {
		String status = (isStart) ? "Start" : "End";
		
		System.out.println(String.format("=== %s %s ===========", val, status));
	}
	
	/**
	 * 1. static 최초 실행 테스트
	 * 2. static 사용의 주의사항
	 */
	public static void test1() {
		String[] testNameArr = new String[] {
				"1. static 최초 실행 테스트",
				"2. static 사용의 주의사항"
		};
		
		logSE(testNameArr[0], true);
		
		System.out.println(String.format("[%s=%s]", "t01", Temp01.val1));
		System.out.println(String.format("[%s=%s]", "t01", Temp01.val1));
		System.out.println(String.format("[%s=%s]", "t01", Temp01.val1));
		System.out.println(String.format("[%s=%s]", "t01", Temp01.val1));
		
		logSE(testNameArr[0], false);
		
		logSE(testNameArr[1], true);
		
		Temp02 t02_1 = new Temp02("A");
		Temp02 t02_2 = new Temp02("B");
		
		System.out.println(String.format("[%s=%s][%s=%s]", "t02_1", t02_1.val1, "t02_2", t02_2.val1));
		t02_1.val1 = "메롱";
		System.out.println(String.format("[%s=%s][%s=%s]", "t02_1", t02_1.val1, "t02_2", t02_2.val1));
		
		logSE(testNameArr[1], false);
		
		
		S01 s01 = S01.getInstatnce();
	}
	
	/**
	 * 매개변수 테스트
	 * @param args
	 */
	public static void test2(String[] args) {
		int argsLen = (null == args) ? 0 : args.length;
		
		if (argsLen > 0) {
			for (int i=0; i<argsLen; i++) {
				System.out.println("[args[" + i + "]=" + args[i] + "]");
			}
		} else {
			System.out.println("넘어온 매개변수가 없습니다");
		}
	}
}
