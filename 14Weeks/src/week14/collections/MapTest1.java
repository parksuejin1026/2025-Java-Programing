package week14.collections;

import java.util.Map;
import java.util.HashMap;

public class MapTest1 {

    public static void main(String[] args) {
        Map<String, Integer> pS = new HashMap<>();
        int total = 0;

        pS.put("홍길동", 90);
        pS.put("배철수", 85);
        pS.put("강호동", 95);

        if (pS.containsKey("배철수")) {
            pS.remove("배철수");
        }

        System.out.println("모든 학생 목록");
        for (String name : pS.keySet()) { // 평균을 구하기 위한 총 값 미리 구하기
            System.out.println(name + " -> " + pS.get(name));
            total += pS.get(name);
        }
        System.out.println("총 학생 수 : " + pS.size());

        System.out.println("평균 : " + total / pS.size());
    }

}
