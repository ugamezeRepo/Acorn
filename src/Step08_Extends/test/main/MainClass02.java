package Step08_Extends.test.main;

import Step08_Extends.test.mypac.HandPhone;
import Step08_Extends.test.mypac.Phone;

/**
 * 지역 변수나 필드앞에 선언하는 타입은 참조형
 * 그 안에 들어있는 참조값의 사용설명서라고 생각하면 도니다.
 * 그렇기 떄문에 그 지역변수나 필드에 .을 찍으면 사용설명서에 명시된 기능만 사용할 수 있다.
 * java의 모든 객체는 다형성을 가질 수 있다.
 * 다형성은 타입이 여러개라는 의미이다.
 */
@SuppressWarnings("unused")
public class MainClass02 {
	public static void main(String[] args) {
		// 구라쌤이 HandPhone객체는 3가지 type을 가지고 있다고 했는데 정말 맞을까??
		
		// HandPhone객체를 생성해서 나온 참조값을 HandPhone타입 지역변수 p1에 담기
		HandPhone p1 = new HandPhone();
		// HandPhone객체를 생성해서 나온 참조값을 Phone타입 지역변수 p2에 담기
		Phone p2 = new HandPhone();
		// HandPhone객체를 생성해서 나온 참조값을 Object타입 지역변수 p3에 담기
		Object p3 = new HandPhone();
		
	}
}
