package test.main;

import java.util.Scanner;

import test.mypac.MyUtil;
import test.mypac.WordFilterException;

public class MainClass06 {
  public static void main(String[] args) {
    // 문자열을 입력 받을 객체
    Scanner scan = new Scanner(System.in);

    while (true) {
      System.out.print("전송할 문자열 입력: ");
      String inputMsg = scan.nextLine();

      try {
        // MyUtil 클래스의 static 메서드를 이용해 전송
        MyUtil.sendMessage(inputMsg);
      } catch (WordFilterException e) {
        System.out.printf("error: %s %n", e.getMessage());
      }
    }
  }
}
