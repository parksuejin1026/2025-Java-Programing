package week14.collections;

public class StackImpl {
    // 필드
    private final int MAX_SIZE = 10;
    private String[] stackArr;
    private int top;

    // 생성자
    public StackImpl() {
        stackArr = new String[MAX_SIZE];
        top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == MAX_SIZE - 1);
    }

    public void push(String x) {
        if (isFull()) {
            System.out.println("Full 입니다.");
            return;
        }
        top++;
        stackArr[top] = x;
        System.out.println("push(" + x + ")");
    }

    public String pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        String data = stackArr[top];
        top--;
        System.out.println("pop() : " + data);
        return data;
    }

    public String peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
            return null;
        }
        String data = stackArr[top];
        System.out.println("peek()" + data);
        return data;
    }
}
