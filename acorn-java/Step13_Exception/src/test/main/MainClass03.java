package test.main;

import java.util.Scanner;

public class MainClass03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("나눠지는 수 입력: ");
        String inputNum2 = scan.nextLine();
        System.out.print("나눌 수 입력: ");
        String inputNum1 = scan.nextLine();

        try {
            int num1 = Integer.parseInt(inputNum1);
            int num2 = Integer.parseInt(inputNum2);
            int result = num2 / num1; // 몫
            int result2 = num2 % num1; // 나머지

            System.out.printf("%d을(를) %d(으)로 나눈 몫: %d %n", num2, num1, result);
            System.out.printf("%d을(를) %d(으)로 나눈 나머지: %d %n", num2, num1, result2);
        } catch (Exception e) {
            // Exceiption type은 모든 예외의 부모 type이므로 모든 예외를 이 영역에서 처리 가능.
            System.out.printf("예외 메세지: %s %n", e.getMessage());
        } finally {
            // 예외 발생 상관없이 실행이 보장되는 블럭
            // 중요한 마무리 작업을 주로 이 곳에서 수행
            System.out.println("중요한 마무리 작업을 합니다!");
        }

        System.out.println("main 메서드가 정상 종료됩니다.");
    }
}
