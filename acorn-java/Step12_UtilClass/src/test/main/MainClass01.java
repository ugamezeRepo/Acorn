package test.main;

import java.util.ArrayList;

/**
 * Java에서 배열은 크기를 조절할 수 없는 고정 배열이다.
 * 따라서, 동적으로 item을 추가하고 삭제하는 작업을 하려면 일반배열은 사용할 수 없다.
 * 그래서 해당 작업을 하려면, ArrayList객체를 사용한다.
 */

public class MainClass01 {
	public static void main(String[] args) {
		// String type을 순서대로 저장할 수 있는 ArrayList객체 생성 후 참조값을 names에 대입
		ArrayList<String> names = new ArrayList<>();
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		
		// 0번 방의 아이템을 불러와서 item변수에 대입
		String item = names.get(0);
		System.out.println(item);
		
		// 1번 방의 아이템 삭제
		names.remove(0);
		System.out.println(names);
		
		// 0번 방에 "에이콘" 삽입
		names.add(0, "에이콘");
		System.out.println(names);
		names.set(0, "에이콘 아카데미"); // 0번 방 아이템 수정
		System.out.println(names);
		
		// 저장된 아이템 개수를 size변수에 대입
		int size = names.size();
		System.out.println(size);
		
		// 저장된 모든 아이템 삭제
//		names.clear();
		names.removeAll(names);
		System.out.println(names);
	}
}
