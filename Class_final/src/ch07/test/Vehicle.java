package ch07.test;

public class Vehicle {
    protected String brand; // 자식 클래스에서 접근 가능하도록 protected로 선언

    // 기본 생성자
    public Vehicle(String brand) {
        this.brand = brand;
    }

    // move() 메소드 정의
    public void move() {
        System.out.println(brand + "(이)가 이동합니다.");
    }
}