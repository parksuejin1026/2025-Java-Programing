package ch07.test;

public class Car extends Vehicle {

    // Car 클래스의 생성자: brand에 "자동차" 등록
    public Car() {
        super("자동차"); 
    }

    // move() 메소드 오버라이딩
    @Override 
    public void move() {
        System.out.println(brand + "는 고속도로를 달립니다.");
    }
}