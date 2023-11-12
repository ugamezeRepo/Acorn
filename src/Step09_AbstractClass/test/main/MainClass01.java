package Step09_AbstractClass.test.main;

import Step09_AbstractClass.test.mypac.MyWeapon;
import Step09_AbstractClass.test.mypac.Weapon;
/**
 * [ 추상클래스( Abstract Class) ] 
 * - class 예약어 앞에 abstract를 명시해서 클래스 정의
 * - 형태만 정의되고 실제 구현되지 않은 메서드가 존재
 * - 형태만 정의된 메서드를 만들 때 abstract 예약어 삽입
 * - 생성자는 존재하지만 단독으로 객체 생성 불가
 * - 추상클래스 타입의 참조값이 필요하면 추상클래스를 상속받는 자식클래스를 정의하여 객체 생성
 * - 추상클래스를 상속받은 자식클래스는 반드시 부모의 추상메서드를 모두 오버라이드
 */
public class MainClass01 {
	 public static void main(String[] args) { 
		 // 추상클래스 단독으로 객체 생성 불가
		 // Weapon w1 = new Weapon();
		 
		 // Weapon 추상클래스를 상속받은 MyWeapon 클래스로 객체 생성
		 Weapon w1 = new MyWeapon();

		 w1.prepare();
		 w1.attack();
	}
}
