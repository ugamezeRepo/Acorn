package Step05_Constructor.test.main;

import Step05_Constructor.test.mypac.Member;

public class MainClass02 {
	public static void main(String[] args) {
		Member m1 = new Member();
		m1.num = 1;
		m1.name = "김구라";
		m1.addr = "노량진";
		
		Member m2 = new Member(2, "해골", "행신동");
		
		m1.printInfo();
		m2.printInfo();
	}
}
