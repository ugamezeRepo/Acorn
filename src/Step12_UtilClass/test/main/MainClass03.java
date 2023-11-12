package Step12_UtilClass.test.main;

import java.util.ArrayList;
import java.util.List;

public class MainClass03 {
	public static void main(String[] args) {
		// 인사말을 담을 ArrayList객체를 생성 후 참조값을 List 인터페이스 type 변수에 대입.
		List<String> greets =  new ArrayList<String>();
		
		greets.add("hello");
		greets.add("hi");
		greets.add("good nights");
		
		greets.forEach(item -> System.out.println(item));
	}
}
