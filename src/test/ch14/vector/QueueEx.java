package test.ch14.vector;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
	/*
	 * Queue(FIFO-First In First Out)
	 * 선입선출, 먼저 넣은 객체가 먼저 빠져나간다.
	 * Queue<> 인터페이스
	 * LinkedList() 자동형변환
	 */

	public static void main(String[] args) {
		Queue<Message> msgQ = new LinkedList<>();
		
		//메세지 넣기
		//offer():넣기
		msgQ.offer(new Message("sendMain", "전은미"));
		msgQ.offer(new Message("sendMS", "은은"));
		msgQ.offer(new Message("sendkakao", "미미"));
		
		//메세지 내보내기
		//poll(): 빼기
		while(!msgQ.isEmpty()) {
			Message msg = msgQ.poll();
			System.out.println(msg.command + ", " + msg.to);
		}
	}

}
