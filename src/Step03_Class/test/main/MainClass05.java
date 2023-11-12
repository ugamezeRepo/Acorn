package Step03_Class.test.main;

import java.io.PrintStream;

@SuppressWarnings("unused")

/*
 * System.out.println();
 * 
 * 에 대한 분석!
 */
public class MainClass05 {
	public static void main(String[] args) {
		//System 클래스에는 out 이라는 static 필드가 존재하고
		//거기에는 콘솔창과 연결된 PrintStream type 객체의 참조값이 들어있다.
		PrintStream a = System.out;//static 필드 참조
		a.println("안녕하세요!");
		
		//System 클래스의 static 메소드 호출
		long time = System.currentTimeMillis();
	}
}
