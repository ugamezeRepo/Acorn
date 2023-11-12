package Step13_Exception.test.main;

import Step13_Exception.test.mypac.MyUtil;

public class MainClass05 {
    public static void main(String[] args) {
        //메소드 안에서 발생하는 예외를 직접 처리한 draw() 메소드 호출
        MyUtil.draw();

        //메소드 안에서 발생하는 예외를 throws 한 send() 메소드 호출
        try {
            MyUtil.send();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}