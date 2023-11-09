package text.main;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 *  입력, 출력 (Input, Output)
 *  - 어떤 대상으로부터 데이터를 메모리로 읽어들이는 것을 입력이라고 한다.
 *  - 프로그래밍 언어의 관점에서 메모리라는 것은 변수 or 필드 or 객체로 생각하면 편하다.
 *  - 데이터는 2진수로 이루어져 있지만, 2진수 8개의 묶음인 1byte 단위로 생각하면 편하다.
 *  - 1byte는 총 256가지의 값을 표현할 수 있다.
 *  - 1byte를 10진수로 환산하면 0~255사이의 숫자 중에 하나이다.
 *  - 입력과 출력을 통해 이동하는 데이터는 byte(byte알갱이) 하나 하나가 이동한다고 생각하면 된다.
 *  - 입출력 대상: Console, File, Network
 */

public class MainClass01 {
    public static void main(String[] args) {
        System.out.println("main 메서드가 시작됩니다.");
        
        // 키보드와 연결된 InputStream type의 참조값을 kbd 변수에 대입
        // InputStream 객체는 1byte 단위 처리 스트림
        // 영문자 대소문자, 숫자, 특수문자만 처리 가능
        // 한글 처리 불가
        InputStream kbd = System.in;
        try {
            System.out.print("문자를 입력하세요: ");
            int code = kbd.read();
            System.out.printf("code: %s%n", code);

            // code값에 대응되는 문자
            char ch = (char)code;
            System.out.printf("ch: %s%n", ch);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("main 메서드가 종료됩니다.");
    }
}
