package test.mypac;

/*
 * 자바 메모리에는 static, stack, heap 세 가지로 나뉜다. 
 * static: class 및 static 예약어를 사용한 field, method.
 * 	객체를 생성하지 않고 class와 같이 바로 참조할 수 있다.
 * stack: 지역변수 
 * heap: 객체가 만들어지는 영역, 참조 데이
 */
public class MyUtil {
	// static field
	public static String version = "1.0.0";

	// static method
	public static void send() {
		System.out.println("전송합니다.");
	}
}
