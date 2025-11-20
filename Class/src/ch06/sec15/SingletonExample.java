package ch06.sec15;

public class SingletonExample {
	public static void main(String[] args) {
		// Singleton obj1 = new Singleton(); 이미 싱글톤으로 지정해서 만들었기 때문에 새로 만들면 컴파일 에러 
		
		Singleton obj1 = Singleton.gerInstance();
		Singleton obj2 = Singleton.gerInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체 입니다.");
		}
	}
}
