package test.main;

import java.util.ArrayList;

public class MainClass02 {
	public static void main(String[] args) {
		// 정수를 저장하는 ArrayList<Integer> 생성 후 참조값을 nums에 대입
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		// ArrayList객체에 10, 20, 30 대입
		nums.add(10);
		nums.add(20);
		nums.add(30);
		
		// ArrayList객체에 저장된 값을 for문을 이용해 순서대로 출력
		System.out.println("for문");
		for (int i=0; i<nums.size(); i++) {
			System.out.println(nums.get(i));
		}
		
		System.out.println("확장 for문");
		for (int index:nums) {
			System.out.println(index);
		}
		
		System.out.println("for-each문");
		nums.forEach(item -> System.out.println(item));
	}
}
