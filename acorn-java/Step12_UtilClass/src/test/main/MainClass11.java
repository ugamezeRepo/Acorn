package test.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainClass11 {
    public static void main(String[] args) {
        // samole 데이터 (영어 사전 역할)
        Map<String, String> dic = new HashMap<>();

        dic.put("house", "집");
        dic.put("phone", "전화기");
        dic.put("car", "자동차");
        dic.put("pencil", "연필");
        dic.put("eraser", "지우개");

        // [ 콘솔창 실행 결과 ]
        // 검색할 단어를 입력하세요: house
        // house의 뜻은 집입니다.
        Scanner input = new Scanner(System.in);
        System.out.print("검색할 단어를 입력하세요: ");
        String word = input.next();

        if ( dic.containsKey(word)) {
            System.out.printf("%s의 뜻은 %s입니다. %n", word, dic.get(word));
        } else {
            System.out.printf("안타깝게도 %s이란 단어는 사전에 없는 단어입니다.", word);
        }
    }
}
