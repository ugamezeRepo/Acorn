package Step09_AbstractClass.test.mypac;
/*
 * Weapon 클래스를 만드는 개발자는 유틸리티 개발자 혹은
 * 프레임 개발자 혹은 여러분의 회사 팀장이라고 생각.
 * 
 * 이 클래스를 팀원이 상속받아서 사용.
 * 
 * 특정 메서드는 상속받은 후 재정의(override)해서 사용하도록 추상메서드로 제공.
 * 
 * 팀원은 추상메서드를 재정의해서 자기 상황에 맞게 구현.
 */
public abstract class Weapon {
	// 무기 작동을 준비하는 메서드
	public void prepare() {
		System.out.println("무기 작동을 준비합니다.");
	}
	
	// 공격하는 메서드의 모양만 정의하고 실제 구현 X
	// 미완성된 추상메서드를 만들 때는 abstract 예약어 사용.
	public abstract void attack();
}
