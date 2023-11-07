package test.main;

@SuppressWarnings("unused")
public class MainClass07 {
	public static void main(String[] args) {
		// 지역 변수를 미리 만들고 나중에 필요한 값을 넣고 싶으면 초기값을 대입하는 것이 좋다.
		int num1 = 0; // null은 참조데이터 타입의 초기값. 넣으려하면 Error
		String name1 = null;
		boolean boolean1 = false;

		num1 = 10;
		name1 = "김구라";
		boolean1 = true;
	}
}