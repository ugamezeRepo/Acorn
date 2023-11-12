package Step12_UtilClass.test.main;

import java.util.HashMap;
import java.util.Map;

import Step12_UtilClass.test.mypac.Car;

/**
 *  Java에서 어떤 데이터를 key: value의 쌍으로 관리할 때 HashMap 객체 사용
 *  key의 generic도 마음대로 지정 가능하지만 보통 String type으로 사용
 */

public class MainClass09 {
    public static void main(String[] args) {
        // HasgMap 객체를 생성해서 참조값을 Map interface type에 대입
        Map<String, Object> map1 = new HashMap<String, Object>();
        map1.put("num", 1);
        map1.put("name", "김구라");
        map1.put("isMan", true);
        map1.put("car", new Car("소나타"));

        // value의 generic 클래스가 object로 지정되어 있어
        // 리턴되는 object type을 원래 type으로 casting
        int num = (int)map1.get("num");
        String name = (String)map1.get("name");
        boolean isMan = (boolean)map1.get("isMan");
        Car car = (Car)map1.get("car");

        // 동일한 key값으로 다시 담으면 수정
        map1.put("name", "에이콘");
        // 특정 key값으로 담긴 내용 삭제, 성공 시 true, 실패시 false 리턴
        map1.remove("isMan");
        // 모두 삭제
        map1.clear();
    }
}
