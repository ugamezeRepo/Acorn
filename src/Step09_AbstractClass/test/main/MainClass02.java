package Step09_AbstractClass.test.main;

import Step09_AbstractClass.test.mypac.MyWeapon;
import Step09_AbstractClass.test.mypac.Weapon;

public class MainClass02 {
	public static void main(String[] args) {
		String data = "asdasdsad";
		// useString 메서드 호출
		useString("abcd");
		useString("abcd1234");
		useString(data);

		// 아래의 useWeapon() 메서드 호출
		useWeapon(new MyWeapon());

		System.out.println("main 메서드가 종료됩니다.");
	}

	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}

	private static void useString(String msg) {
		System.out.println(msg + "의 길이: " + msg.length());
	}
}
