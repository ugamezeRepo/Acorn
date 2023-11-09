package test.main;

import test.mypac.MyUtil;

public class MainClass05 {
  public static void main(String[] args) {
    // 메서드 안에서 발생하는 예외를 직접 처리한 draw() 호출
    MyUtil.draw();
    
    try {
      MyUtil.send();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
