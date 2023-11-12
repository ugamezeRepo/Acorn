package Step05_Constructor.test.main;

import java.util.Scanner;

public class MainClass05 {
	public static void main(String[] args) {
		// 키보드로부터 입력받을 수 있는 기능을 가진 객체 생성
		Scanner scan = new Scanner(System.in);
		
		// 개행기호를 출력하지 않고 콘솔창에 문자열 출력 
		System.out.print("문자열 입력: ");
		
		// 문자열을 한 줄 입력받고
		String str = scan.nextLine();
		
		scan.close();
		// 입력받은 문자열을 콘솔에 출력
		System.out.println(str);
		System.out.println("main 메소드가 종료되었습니다.");
	}
}
