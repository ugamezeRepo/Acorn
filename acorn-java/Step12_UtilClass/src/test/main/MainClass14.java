package test.main;

import java.util.*;

public class MainClass14 {
    public static void main(String[] args) {
        // ArrayList 객체에 중복된 데이터를 대입 후
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(10);
        nums.add(20);
        nums.add(30);

        // type 확인
        Collection<Integer> nums2 = nums;

        // HashSet 객체 생성자에 ArrayList를 전달해 중복 제거 가능
        Set<Integer> set = new HashSet<>(nums);

        // 중복 제거된 Set을 이용해 ArrayList 새로 생성
        List<Integer> result = new ArrayList<>(set);

        // 오름차순 정렬
        Collections.sort(result);

        // 내림차순 정렬
        result.sort(Collections.reverseOrder());
    }
}
