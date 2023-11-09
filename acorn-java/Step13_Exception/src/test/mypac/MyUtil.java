package test.mypac;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;


public class MyUtil {
  // 문자열을 전송하는 가상의 메서드
  public static void sendMessage(String msg) {
    // 금지된 단어 목록
    Set<String> wordSet = new HashSet<>();
    wordSet.add("바보");
    wordSet.add("똥깨");
    wordSet.add("멍청이");

    wordSet.forEach(filter -> {
      if (msg.contains(filter)) throw new WordFilterException(filter + "는 금지된 단어입니다.");
      });
    System.out.printf("%s를 전송합니다. %n", msg);
  }

  // 5초가 걸리는 가상의 그림을 그리는 메서드
  public static void draw () {
    System.out.println("5초 동안 그림을 그려요...");

    try {
      Thread.sleep(5000);
    } catch (Exception e) {
      System.out.printf("error : %s %n", e);
    }

    System.out.println("그림 완성!"); 
  }

  public static void send() throws InterruptedException {
    // 5초가 걸리는 가상의 전송을 하는 메서
    System.out.println("5초 동안 전송을 해요...");

    Thread.sleep(5000);
    
    System.out.println("전송 완료!");
  }

}
