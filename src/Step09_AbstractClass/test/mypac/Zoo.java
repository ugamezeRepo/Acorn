package Step09_AbstractClass.test.mypac;

/* 이너클래스( Inner Class) */
public class Zoo {
	// 이너클래스
	public class Monkey { // Zoo.Monkey 타입
		public void say() {
			System.out.println("안녕! 나는 원숭이야!");
		}
	}

	public class Tiger {
		public void say() {
			System.out.println("안녕! 나는 호랑이야!");
		}
	}
	
	// 메서드
	public Monkey getMonkey() {
		// 내부클래스로 객체를 생성해서 리턴
		return new Monkey();
	}
	
	public Tiger getTiger() {
		return new Tiger();
	}
	
}
