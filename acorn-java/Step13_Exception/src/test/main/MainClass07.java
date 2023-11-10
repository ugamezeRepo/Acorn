package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass07 {
  public static void main(String[] args) {
    System.out.println("main 메서드가 시작됩니다.");

    // 현재 존재하거나 혹은 존재하지 않는 파일이나 폴더를 제어할 수 있는 File 객체를 생성해 참조값을 f변수에 대입
    File f= new File("/Users/amuzment/Documents/tmp/myFolder/memo.txt");

    // File 객체의 메서드를 활용해 실제 memo.txt가 없으면 생성, 있으면 삭제하는 프로그램 작성
    if (f.exists()) {
      f.delete();
      System.out.printf("%s 파일을 삭제했습니다. %n", f.getName());
    }
    else {
      try {
        f.createNewFile();
        System.out.printf("%s 파일을 생성했습니다. %n", f.getName());
      } catch (IOException e) {
        System.out.println(e);
      }
    }

        System.out.println("main 메서드가 종료됩니다.");
  }
}
