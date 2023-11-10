package test.main;

import java.util.Scanner;

public class MainClass01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("숫자 입력: ");
        // 숫자 형식의 문자열 입력 "10", "20", "10.1" 등등
        String inputNum = scan.nextLine();

        try {
            // 입력한 숫자(문자열)를 실제 숫자로 전환
            double num = Double.parseDouble(inputNum);
            // 입력한 수에 100을 더함
            double result = num + 100;
            System.out.printf("%s + 100 = %f", inputNum, result);
        } catch (NumberFormatException nfe) {
            // 실행 스택에서 일어난 일을 콘솔 창에 출력
            // (자세한 예외 정보를 예외객체가 콘솔 창에 출력하도록 하기)
            nfe.printStackTrace();
        }

    }
}
