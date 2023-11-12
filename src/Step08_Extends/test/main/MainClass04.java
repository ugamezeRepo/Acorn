package Step08_Extends.test.main;

import Step08_Extends.test.mypac.HandPhone;
import Step08_Extends.test.mypac.Phone;

@SuppressWarnings("unused")
public class MainClass04 {
	public static void main(String[] args) {
		// HandPhone객체 참조값을 Object타입 p3의 지역변수에 담는다.
		Object p3 = new HandPhone();
		
		// casting연산자를 이용해 대입연산자의 우항을 Phone타입으로 인식되도록 한다.
		Phone p2 = (Phone)p3;
		
		// casting연산자를 이용해 대입연산자의 우항을 HandPhone타입으로 인식되도록 한다.
		HandPhone p1 = (HandPhone)p3;
	}
}
