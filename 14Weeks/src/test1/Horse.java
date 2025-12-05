package test1;

public class Horse extends Animal implements AnimalDoing{
	public Horse(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void eat() {
		System.out.println(name + "먹습니다.");
	}

	
	public void bark() {
		System.out.println(name + "짖습니다.");

	}

	
	public void walk() {
		System.out.println(name + "걷습니다.");

	}

	
	public void sitDown() {
		System.out.println(name + "앉습니다.");

	}

	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(name + "가 달립니다.");
	}

	
	public void bite() {
		// TODO Auto-generated method stub
		System.out.println(name + "뭅니다.");
	}
}
