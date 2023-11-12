package Step12_UtilClass.test.main;

import java.util.ArrayList;
import java.util.List;

import Step12_UtilClass.test.mypac.MemberDto;

public class MainClass07 {
	public static void main(String[] args) {
		// MemberDto 객체를 담는 ArrayList 생성
		List<MemberDto> list = new ArrayList<MemberDto>();
		
		// MemberDto 객체에 회원 정보 대입
		// default 생성자로 객체 생성 후 setter 메서드로 값 대입
		MemberDto dto1 = new MemberDto();
		dto1.setNum(1);
		dto1.setName("김구라");
		dto1.setAddr("노량진");
		
		// 생성자의 매개변수로 대입
		MemberDto dto2 = new MemberDto(2, "해골", "행신동");
		
		list.add(dto1);
		list.add(dto2);
		list.add(new MemberDto(3, "원숭이", "동물원"));
		
		// ArrayList에 담긴 회원정보를 반복문으로 출력
		for (MemberDto mem:list) {
			System.out.printf("번호: %d, 이름: %s, 주소: %s %n", mem.getNum(), mem.getName(), mem.getAddr());
		}
	}
}
