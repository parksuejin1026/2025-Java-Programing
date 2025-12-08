package week14.bank;

import java.util.LinkedList;
import java.util.Queue;

public class BankQueue {

    private Queue<Customer> queue = new LinkedList<>();

    public void addCustomer(Customer c) {
        queue.offer(c);
        System.out.println("고객 대기 등록: " + c.getName() + " (" + c.getJobList() + ")");
    }

    public void nextCustomer() {
        Customer c = queue.poll();
        if (c != null) {
            System.out.println("고객 업무 처리 중: " + c.getName() + " - " + c.getJobList());
        } else {
            System.out.println("대기 중인 고객이 없습니다.");
        }
    }

    public int getWaitingCount() {
        return queue.size();
    }
}
