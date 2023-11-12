package Step08_Extends.test.auto;
/*
 * engine필드의 접근지정자
 * public, protected, default, private
 * 
 * public: 어디에서나 접근 가능
 * protected: 동일한 package 혹은 상속된 자식에서 접근 가능
 * default(작성 X): 동일한 package 안에서만 접근 가능
 * private: 동일한 클래스 혹은 객체 안에서만 접근 가능
 * 
 * - 접근 지정자를 붙이는 위치
 * 1. 클래스를 선언할 때
 * 2. 생성자
 * 3. 필드
 * 4. 메소드
 * 
 * 클래스는 default와 public 두 가지만 가능
 */
public class Car {
	// 필드
	protected Engine engine;

	// Engine객체를 생성자의 인자로 전달받는 생성자
	public Car(Engine engine) {
		this.engine = engine;
	}

	// 메서드
	public void drive() {
		if (this.engine == null) {
			System.out.println("Engine이 없어서 달릴 수 없어요!");
			return; // 메서드를 여기서 리턴(종료)
		}
		System.out.println("달려요~");
	}
}
