package test.main;

import test.mypac.Cpu;
import test.mypac.HardDisk;
import test.mypac.MacBook;
import test.mypac.Memory;

@SuppressWarnings("unused")
public class MainClass03 {
	public static void main(String[] args) {
		/**
		 * MacBook 객체를 생성하여 참조값을 mac1이라는 지역 변수에 담기
		 * 
		 * 주의!!
		 * - MacBook 클래스를 절대 수정 X
		 * - MainClass03은 test.main 패키지에 있고
		 * 	Cpu, Memory, HardDisk, MacBook 클래스는 
		 * 	test.mypac 패키지에 있으므로 4개 클래스 모두 import 되어야 한다.
		 */
		
		// 생성자의 매개변수에 전달한 값을 직접 생성하여 전달.
		MacBook mac1 = new MacBook( new Cpu(), new Memory(), new HardDisk());
		
		Cpu c1 = new Cpu();
		Memory m1 = new Memory();
		HardDisk h1 = new HardDisk();
		
		// 생성자의 매개변수에 전달한 값이 지역변수에 저장되어 있으면 지역변수명으로 전달 가능.
		MacBook mac2 = new MacBook( c1, m1, h1);
	}
}
