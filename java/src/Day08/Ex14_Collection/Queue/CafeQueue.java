package Day08.Ex14_Collection.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class CafeQueue {
	
	public static void main(String[] args) {
		// 큐 자료구조로 손님 줄서기와 응대하기
		Queue<String> queue = new LinkedList<>();
		
		// 손님 줄서기
		queue.offer("원이");
		queue.offer("미나미");
		queue.offer("제나");
		
		System.out.println("현재 대기줄 : " + queue);
		
		// 손님 응대
		while ( !queue.isEmpty() ) {
			System.out.println( queue.peek() + " 님 안녕하세요!");
			String customer = queue.poll();		
			System.out.println(customer + " 님 주문완료!");
			System.out.println("남은 대기줄 : " + queue);
		}
		System.out.println("업무가 종료되었습니다!");
		
	}

}





