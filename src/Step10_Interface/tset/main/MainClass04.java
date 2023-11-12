package Step10_Interface.tset.main;

import Step10_Interface.tset.mypac.Drill;

public class MainClass04 {
	public static void main(String[] args) {
		useDrill(new Drill() {
			@Override
			public void hole() {
				System.out.println("바닥에 구멍 뚜럿!");
			}
		});
		
		// 위를 줄인 것. JS의 Arrow Function처럼 활용 가능.
		useDrill(()-> System.out.println("바닥을 뚜럿!"));
	}
	
	public static void useDrill(Drill d) {
		d.hole();
		d.hole();
	}
}
