package ch07.test;

public class MoveExample {
    public static void main(String[] args) {
        // Car 객체 생성 및 move() 메소드 호출
        Car car = new Car();
        System.out.print("Car 객체 호출 결과: ");
        car.move();

        // Motorcycle 객체 생성 및 move() 메소드 호출
        motorcycle motorcycle = new motorcycle();
        System.out.print("Motorcycle 객체 호출 결과: ");
        motorcycle.move();
    }
}