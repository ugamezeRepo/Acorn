package Step05_Constructor.test.main;

import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		// 1. 크기 5의 문자열 배열객체를 생성해 참조값을 msgs라는 지역변수에 담기
		String msgs[] = new String[5];
		
		// 2. Scanner객체를 생성해 참조값을 scan이라는 지역변수에 담기
		Scanner scan = new Scanner(System.in);
		
		// 3. 반복문을 위에서 생성한 배열의 방의 개수만큼 돌면서 키보드로부터 문자열을 입력받아 배열에 순서대로 저장
		for (int i=0; i<msgs.length; i++) {
			msgs[i] = scan.nextLine();
		}
		
		scan.close();
		
		// 4. 반복문을 돌며 배열에 저장된 모든 문자열을 순서대로 출력
		for (String tmp:msgs)	System.out.println(tmp);

	}
}
