package test.ch13.multiThread;

public class ThreadNameEx {

	public static void main(String[] args) {
		/*
		 * 메인스레드 이름 가져오기
		 * currentThread() 
		 * -> 현재 실행되고 있는 메인스레드를 얻어온다.
		 */
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName() + "실행");//메인스레드 이름 출력
		
		//스레드 3개 생성
		for(int i=0; i<3; i++) {
			//익명인터페이스로 구현
			Thread threadA = new Thread(){ //상속+클래스 만드는걸 동시에
				@Override
				public void run() {
					System.out.println(getName() + "실행"); //스레드 이름을 가져온다.
				}
			};
			
			threadA.start();		
		}
		
		//chat 스레드 생성
		Thread chatThread = new Thread() {

			@Override
			public void run() {
				System.out.println(getName() + "실행"); //이름을 가져온다.
			}
			
		};
		
		chatThread.setName("chat-thread"); //스레드가 실행되기 전에 이름을 바꾼다.
		chatThread.start();
			
		}
}
