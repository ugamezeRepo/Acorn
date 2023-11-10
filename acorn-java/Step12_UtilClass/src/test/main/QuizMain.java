package test.main;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizMain {
	public static void main(String[] args) {
		/*
		 * Scanner객체를 이용하여 반복문으로 3명의 이름을 입력받아 
		 * ArrayList객체에 순서대로 저장 후 반복문으로
		 * ArrayList에 저장된 이름을 출력
		 */
		
		Scanner input = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<String>();
		
		for (int i=0; i<3; i++) {
			System.out.print("이름을 입력하세요: ");
			names.add(input.next());
		}
		input.close();
		
		for (String tmp: names) {
			System.out.printf("이름: %s %n", tmp);
		}
		
		names.forEach(name-> System.out.println(name));
	}
}
