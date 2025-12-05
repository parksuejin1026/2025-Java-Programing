package test1;

import java.util.ArrayList;

public class play {

	public static void main(String[] args) {

		Cat c = new Cat("담비",13);
		
		Horse h = new Horse("골드쉽", 22);
		
		Dog d = new Dog("쿵이", 10);
		
		d.run();
		d.bite();
		h.sitDown();
		h.eat();
		c.bark();
		c.walk();
		
		Dog[] dg = new Dog[5];
		
	
		
		for(int i = 0; i < 5 ; i++) {
			dg[i] = d;
			System.out.printf("%s%d bark 멍멍\n", d.getName(), i+1);
			
		}
		
		Dog d1 = new Dog("바둑이",13);
		Dog d2 = new Dog("돌돌이", 11);
		Dog d3 = new Dog("멍멍이", 12);
		
		ArrayList <Dog> dog = new ArrayList<>();
		dog.add(d1);
		dog.add(d2);
		dog.add(d3);
		
	for(int i = 0; i < dog.size() ; i++) {
		System.out.printf("%s bark 멍멍\n", dog.get(i));
		
		}
	
	for(Dog d123 : dog) {
		d123.bark();
	}
	}

}
