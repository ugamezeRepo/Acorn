package Step09_AbstractClass.test.mypac;

public class MyWeapon extends Weapon{
	// 부모 클래스의 추상메서드를 반드시 override
	@Override
	public void attack() {
		// 어디를 공격할 지는 프로젝트 상황에 맞게 구현
		System.out.println("지상 공격을 해요!");
	}

}
