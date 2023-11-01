package test.main;

import java.util.Scanner;

public class MainClass06 {
	public static void main(String[] args) {
		// 1. 문자열을 저장할 수 있는 5개 방의 배열객체를 생성해 참조값을 msgs라는 지역변수에 담기
		String msgs[] = new String[5];
		
		// 2. 키보드로부터 입력받을 수 있는 Scanner객체를 생성해 참조값을 scan이라는 지역변수에 담기
		Scanner scan = new Scanner(System.in);
		
		// 3. 반복문을 위에서(1번) 생성한 배열의 방의 개수만큼 돌면서 키보드로부터 문자열을 입력받아 배열에 순서대로 저장
		for (int i=0; i<msgs.length; i++) {
			msgs[i] = scan.nextLine();
		}
		
		
		// 4. 반복문을 돌며 배열에 저장된 모든 문자열을 순서대로 출력
		for (String tmp:msgs)	System.out.println(tmp);

	}
}
