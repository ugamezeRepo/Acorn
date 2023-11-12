package Step09_AbstractClass.test.main;

import Step09_AbstractClass.test.mypac.Zoo;
import Step09_AbstractClass.test.mypac.Zoo.*;

public class MainClass03 {
	public static void main(String[] args) {
		Zoo z1 = new Zoo();
		// Zoo.Monkey m1 = z1.getMonkey();
		Monkey m1 = z1.getMonkey();
		m1.say();
		
		// Zoo객체를 생성해 변수z2에 담기
		Zoo z2 = new Zoo();
		// z2값을 이용해 getTiger()메서드를 호출 후 리턴되는 값을 변수t1에 담기
		// Zoo.Tiger t1 =  z2.getTiger();
		Tiger t1 = z2.getTiger();
		// 리턴된 Tiger객체의 say()메서드 호출
		t1.say();
	}
}
