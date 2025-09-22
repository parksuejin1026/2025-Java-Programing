package Ch02;

public class VariableScopeExample {

	public static void main(String[] args) {
		int v1 = 15;
		if(v1>10) {
			int v2 = v1 - 10;
			System.out.print("결과는 : " +  v2);
		}
		// int v3 = v1 + v2 + 5 // error v2의 값은 if 함수 안에서만 한정됨 변수 사용 범위

	}

}
