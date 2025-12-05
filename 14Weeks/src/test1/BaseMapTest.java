package test1;

import java.util.Map;
import java.util.HashMap;

public class BaseMapTest {

	public static void main(String[] args) {
		// Map 생성
		Map<String, Integer> scoreMap = new HashMap<>();
		
		// put() - 데이터 저장
		scoreMap.put("홍길동", 90);
		scoreMap.put("김철수", 85);
		scoreMap.put("이영희", 95);
		
		// get() - 특정 key인 값 가져오기
		System.out.println("홍길동 점수 : " + scoreMap.get("홍길동"));
		
		// containsKey() - key 존재 여부 확인
		System.out.println("김철수는 존재하나? " + scoreMap.containsKey("김철수"));
		
		// remove() - key에 해당하는 항목 삭제
		scoreMap.remove("김철수");
		
		// keySet() - 모든 Key 출력
		System.out.println("모든 학생 목록");
		for(String name : scoreMap.keySet()) {
			System.out.println(name + " -> " + scoreMap.get(name));
		}
		
		// size() - 요소 개수
		System.out.println("총 학생 수 : " + scoreMap.size());
		
		
		

	}

}
