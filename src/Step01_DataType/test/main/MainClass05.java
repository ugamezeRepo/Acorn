package Step01_DataType.test.main;

@SuppressWarnings("unused")
/*
 *	[ Java 참조 데이터 type ]
 * 
 * 4. 문자열 String Type
 *	- 문자열을 다룰 때 사용하는 데이터 type
 */
public class MainClass05 {
	public static void main(String[] args) {
		// "김구라"라는 String type 객체를 heap 영역에 만들고 그 참조값을 변수에 담기
		String name = "김구라";
		// name 안에 있는 참조값을 tmp 변수에 복사하기
		String tmp = name;
		// "원숭이"라는 String type 객체를 heap영역에 만들고 그 참조값을 name 변수에 덮어쓰
		name = "원숭이";
		// name 변수를 비우기 ( null은 참조데이터 type이 담길 수 있는 빈 공간을 의미한다.)
		name = null;
	}
}
