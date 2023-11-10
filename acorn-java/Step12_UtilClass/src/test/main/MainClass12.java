package test.main;

import java.util.HashSet;
import java.util.Set;

/**
 *  HashSet은 Set interface를 구현한 클래스
 *  - 순서 X
 *  - key 값 존재 X
 *  - 중복 허용 X
 *  - 어떤 data를 묶음(집합)으로 관리할 때 사용
 */
public class MainClass12 {
    public static void main(String[] args) {
        // 정수를 저장할 수 있는 HashSet 객체를 생성해 참조값을 Set interface type 변수에 대입
        Set<Integer> set1 = new HashSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(20);
        set1.add(30);
        set1.add(30);

        Set<String> set2 = new HashSet<>();
        set2.add("kim");
        set2.add("lee");
        set2.add("park");
        set2.add("lee");
        set2.add("park");

        System.out.printf("set1: %s %nset2: %s %n", set1, set2);

        // 특정 item( 데이터, 참조값) 존재 여부 조회
        boolean isContains = set2.contains("lee");
        System.out.println(isContains);
        // 저장된 item 개수
        int size = set2.size();
        System.out.println(size);
        // 특정 item 삭제
        System.out.println(set2);
        set2.remove("park");
        System.out.println(set2);
        // 모든 item 삭제
        set2.clear();
        System.out.println(set2);
    }
}
