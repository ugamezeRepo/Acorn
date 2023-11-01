package test.main;

import test.mypac.HandPhone;
import test.mypac.SmartPhone;

public class MainClass06 {
	public static void main(String[] args) {
		// 자식에게 사준 일반 휴대폰(인터넷이 안 됨)
		HandPhone p1 = new HandPhone();
		
		// 엄마! 나도 Smartphone 가지고 싶어!!!
		// 엄마가 새로운 설명서를 가지고왔어. 이제 그 폰은 AndroidPhone이야.
		SmartPhone p2 = (SmartPhone)p1; // runtime 시 ClassCastException 발생.
		
		// 진짜? 엄마 짱이다~~
		// 나 이제 인터넷한다~~!
		p2.doInternet();
	}
}
