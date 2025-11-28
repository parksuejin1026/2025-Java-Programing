package lesson;

import java.util.ArrayList;

public class 배열리스트테스트 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		// 요소 추가
		list.add("Apple");
		list.add("Banana");
		list.add("Cherry");
		
		// 출력
		System.out.println(list);
		// 요소 접근
		String firstElement = list.get(0); // 배열의 0번째 인덱스를 가져온다. get
		System.out.println("첫 번째 요소 : " + firstElement);
		
		// 요소 수정
		System.out.printf("Before : %s\n", list);
		list.set(1,  "Bluberry"); // 배열의 1번째 인덱스를 변경한다. set
		System.out.printf("After : %s\n", list);
		
		// 요소 삭제
		System.out.printf("Before : %s\n", list);
		list.remove(2); // 배열의 2번째 인덱스를 삭제한다. remove
		System.out.printf("After : %s\n", list);
		
		// list 사이즈 확인하기
		int size = list.size();
		System.out.println("리스트 크기 : " + size);
		System.out.println();
		boolean hasApple = list.contains("Apple"); // 포함하는 지 확인 contains()
		System.out.println("Does it contain an APple? : " + hasApple);
		
		// ArrayList의 모든 요소 반복하기
		for (String fruit : list) {
			System.out.println(fruit);
		}
	}

}

