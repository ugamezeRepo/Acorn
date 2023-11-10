package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainClass10 {
    public static void main(String[] args) {
        /*
         *  세 명의 회원 정보( 번호, 이름, 주소)를 HashMap 객체에 담아
         *  ArrayList 객체에 누적
         *  반복문으로 ArrayList에 누적된 회원정보를 콘솔 창에 순서대로 출력
         *  (HashMap 객체 3개, ArrayList 객체 1개가 생성)
         *  ArrayList 객체 안에 HasgMap을 담을 예정이니
         *  List<HashMap<String, Object>> type이 필요
         */

        List<Map<String, Object>> members = new ArrayList<Map<String, Object>>();

        Map<String, Object> mem1 = new HashMap<>();
        mem1.put("num", 1);
        mem1.put("name", "송태정");
        mem1.put("addr", "수서");
        members.add(mem1);

        Map<String, Object> mem2 = new HashMap<>();
        mem2.put("num", 2);
        mem2.put("name", "김태준");
        mem2.put("addr", "양주");
        members.add(mem2);

        Map<String, Object> mem3 = new HashMap<>();
        mem3.put("num", 3);
        mem3.put("name", "김혜란");
        mem3.put("addr", "용인");
        members.add(mem3);

        members.forEach(System.out::println);

        /*
         * Map<String, Object> map1=new HashMap<>();
         * 		map1.put("num", 1);
         * 		map1.put("name", "김구라");
         * 		map1.put("addr", "노량진");
         *
         * 		Map<String, Object> map2=new HashMap<>();
         * 		map2.put("num", 2);
         * 		map2.put("name", "해골");
         * 		map2.put("addr", "행신동");
         *
         * 		Map<String, Object> map3=new HashMap<>();
         * 		map3.put("num", 3);
         * 		map3.put("name", "원숭이");
         * 		map3.put("addr", "상도동");
         *
         * 		// List 의 Generic type 은  Map 이다
         * 		List<Map<String, Object>> list=new ArrayList<>();
         * 		//순서대로 담기
         * 		list.add(map1);
         * 		list.add(map2);
         * 		list.add(map3);
         *
         * 		for(Map<String, Object> tmp :list) {
         * 			String result=String.format("번호:%d 이름:%s 주소:%s",
         * 					(int)tmp.get("num"), (String)tmp.get("name"), (String)tmp.get("addr"));
         * 			System.out.println(result);
         */
    }
}
