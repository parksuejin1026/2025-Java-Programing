package week14.animals;

public class Cat extends Animal implements AnimalDoing {
    public Cat(String name, int age) {
        super(name, age);
    }

    public void eat() {
        System.out.println(name + " 먹습니다.");
    }

    public void bark() {
        System.out.println(name + " 짖습니다.");
    }

    public void walk() {
        System.out.println(name + " 걷습니다.");
    }

    public void sitDown() {
        System.out.println(name + " 앉습니다.");
    }

    public void run() {
        System.out.println(name + " 달립니다.");
    }

    public void bite() {
        System.out.println(name + " 뭅니다.");
    }
}
