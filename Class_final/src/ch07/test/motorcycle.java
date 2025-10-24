package ch07.test;

public class motorcycle extends Vehicle {

    // Motorcycle 클래스의 생성자: brand에 "오토바이" 등록
    public motorcycle() {
        super("오토바이"); 
    }

    // move() 메소드 오버라이딩
    @Override 
    public void move() {
        System.out.println(brand + "는 일반 도로를 달립니다.");
    }
}