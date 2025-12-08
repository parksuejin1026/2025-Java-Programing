package week14.collections;

import java.util.Queue;
import java.util.LinkedList;

public class QueueTest1 {

    public static void main(String[] args) {
        Queue<String> Q = new LinkedList<>();
        Q.add("철수");

        Q.add("경수");
        Q.add("정수");

        while (true) {
            if (Q.isEmpty() == true) {
                System.out.println("End!!");
                break;

            }
            System.out.println("next : " + Q.poll());

        }
    }

}
