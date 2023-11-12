package Step08_Extends.test.main;

import Step08_Extends.test.mypac.HandPhone;
import Step08_Extends.test.mypac.Phone;

@SuppressWarnings("unused")
public class MainClass03 {
	public static void main(String[] args) {
		// 아래의 3줄을 실행하면 참조값이 몇 개가 나올까? (객체가 몇 개가 생성될까?)
		HandPhone p1 = new HandPhone(); // 여기서 HandPhone객체 1개 생성.
		Phone p2 = p1; // 객체 생성X, p1에 들어있던 참조값이 p2에 복사
		Object p3 = p1; // 객체 생성X, p1에 들어있던 참조값이 p3에 복사
		
		// 자식 객체의 참조값은 부모타입으로 선언된 변수나 필드에 담길 수 있다.
	}
}
