package test.atuo;
/*
 * engine필드의 접근지정자
 * public, protected, default, private
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
