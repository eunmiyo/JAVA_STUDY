package test.ch10.resource;

public class TryWithResource {

	public static void main(String[] args) {
		//try안에 열고 싶은 리소스 객체 생성
		try (MyResource res = new MyResource("A")) {
			String data = res.read1(); //return "100"을 data에 넣음
			int value = Integer.parseInt(data); //int형 변환
			System.out.println(value);
		} catch(NumberFormatException e) {
			System.out.println("NumberFormatException::" + e.getMessage());
		} catch(Exception e) {
			//System.out.println("Exception::" + e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}

		
		System.out.println("=================");
		 
		//try안에 열고 싶은 리소스 객체 생성
		try(MyResource res = new MyResource("A")) {
			String data = res.read2(); //NumberFormatException 에러발생, "abc"는 숫자로 변환이 안되기 때문에
			int value = Integer.parseInt(data); //int형 변환
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
