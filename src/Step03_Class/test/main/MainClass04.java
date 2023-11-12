package Step03_Class.test.main;

import Step03_Class.test.mypac.MyUtil;

public class MainClass04 {
	public static void main(String[] args) {
		// MyUtil class의 static method 호출
		MyUtil.send();

		// MyUtil class의 static field 호출
		String version = MyUtil.version;
		System.out.println(version);

	}
}
