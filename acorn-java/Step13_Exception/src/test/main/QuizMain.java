package test.main;

public class QuizMain {
    public static void main(String[] args) {
        // Run 했을 떄, 콘솔 창에
        // 1초
        // 2초
        // 3초
        // ...
        // 10초
        // 10초간 경과 시간 출력 후 종료 프로그램 생성

        System.out.println("main 메서드가 시작됩니다.");

        for (int i=1; i<11; i++) {
            try {
                Thread.sleep(1000);
                System.out.printf("%d초 %n", i);
            }catch (InterruptedException e) {
                System.out.printf("error: %s %n", e.getMessage());
            }
        }

        System.out.println("main 메서드가 종료됩니다.");
    }
}
