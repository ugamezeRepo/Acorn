package Step09_AbstractClass.test.main;

/* Anonymous Class */

import Step09_AbstractClass.test.mypac.Weapon;

public class MainClass06 {
	public static void main(String[] args) {
		Weapon w1 = new Weapon() {
			/** 
			 * Anonymous Class extends Weapon
			 * new Weapon()은 익명클래스의 생성자를 호출하는 표현식
			 */
			@Override
			public void attack() {
				System.out.println("오잉? 공격하자~");
			}
		};
		useWeapon(w1);

		useWeapon(new Weapon() {
			@Override
			public void attack() {
				System.out.println("지겹다 아무나 공격하자~");
			}
		});
	}
	
	// Weapon type의 참조값을 전달받아서 사용하는 static 메서드
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
		w.attack();
	}
}
