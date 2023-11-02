package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass02 {
	public static void main(String[] args) {
		// useString 메서드 호출
		MainClass02.useString("abcd");
		useString("abcd1234");

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
