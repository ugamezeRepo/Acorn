package Step08_Extends.test.main;

import Step08_Extends.test.mypac.SmartPhone;

public class MainClass05 {
	public static void main(String[] args) {
		// SmartPhone객체를 생성하고 참조값을 SmartPhone타입 p1지역변수에 담기
		SmartPhone p1 = new SmartPhone();
		
		p1.call();
		p1.mobileCall();
		p1.takePicture();
		p1.doInternet();
	}
}
