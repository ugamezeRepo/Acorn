package Step12_UtilClass.test.main;

import java.util.List;
import java.util.ArrayList;

import Step05_Constructor.test.mypac.Member;

public class MainClass05 {
	public static void main(String[] args) {
		// 1. Member 객체를 담는 ArrayList members 객체에 대입
		List<Member> members = new ArrayList<Member>();
		
		// 2. 3명의 회원 정보를 Member 객체에 대입( Member 객체 3개 생성되어야함)
		Member mem1 = new Member(1, "김구라", "노량진");
		Member mem2 = new Member(2, "해골", "행신동");
		Member mem3 = new Member(3, "원숭이", "동물원");
		
		// 3. Member 객체의 참조값을 ArrayList 객체에 대입
		members.add(mem1);
		members.add(mem2);
		members.add(mem3);
		
		// 4. members List 객체에 담긴 내용을 이용해 회원 목록을 아래와 같이 출력
		// 번호: 1, 이름: 김구라, 주소: 노량진
		// 번호: 2, 이름: 해골, 주소: 행신동
		// ...
		members.forEach(mem -> {
//			String a = String.format("번호:%d , 이름:%s , 주소:%s ", mem.num, mem.name, mem.addr);
//			System.out.println(a);
			System.out.printf("번호: %d, 이름: %s, 주소: %s %n", mem.num, mem.name, mem.addr);
		});
	}
}
