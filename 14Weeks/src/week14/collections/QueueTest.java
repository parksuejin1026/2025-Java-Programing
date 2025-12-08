package week14.collections;

import java.util.Queue;
import java.util.LinkedList;

public class QueueTest {

    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("홍길동");
        queue.offer("김철수");
        queue.offer("이영희");

        System.out.println("현재 큐 : " + queue);

        System.out.println("peek(맨 앞 데이터 보기) : " + queue.peek());

        System.out.println("poll(맨 앞 데이터 삭제) : " + queue.poll());

        System.out.println("poll(맨 앞 데이터 삭제) : " + queue.poll());

        System.out.println("큐가 비었나요? : " + queue.isEmpty());

        System.out.println("남은 큐 : " + queue);
    }

}
