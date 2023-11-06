package test.main;

import java.util.HashMap;

public class MainClass08 {
	public static void main(String[] args) {
		// HashMap<key type, value type>
		// key type은 일반적으로 String type 사용
		// value type은 담고싶은 데이터의 type을 고려하여 지정
		// value type을 object로 지정할 경우 모든 data type 대입 가능
		// 순서가 없는 데이터를 다룰 때 사용
		// dto 클래스 대신 사용하기도 함
		
		HashMap<String, Object> map = new HashMap<>();
		map.put("num", 1);
		map.put("name", "김구라");
		map.put("isMan", true);
		
		// value의 generic 클래스가 Object이므로 Object type이 리턴된다. 따라서, casting이 필요
		int num = (int)map.get("num");
		String name = (String)map.get("name");
		boolean isMan = (boolean)map.get("isMan");
	}
}
