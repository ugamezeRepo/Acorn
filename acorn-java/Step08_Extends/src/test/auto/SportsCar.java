package test.auto;

public class SportsCar extends Car{
	public SportsCar(Engine engine) {
		/*
		 * super()는 부모 생성자를 의미한다.
		 * 부모생성자에 필한 값을 자식 생성자에서 받아서 전달해야한다.
		 * super()코드 실행 전에 다른 코드가 있으면 안 된다.
		 */
		super(engine);
	}
	
	public void openDrive() {
		if (this.engine == null) {
			System.out.println("Engine이 없어서 달릴 수 없어요!");
			return; // 메서드를 여기서 리턴(종료)
		}
		System.out.println("지붕 열고 달려요~");
	}
}
