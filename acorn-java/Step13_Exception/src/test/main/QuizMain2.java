package test.main;

/**
 *  Run 했을 때, 콘솔 창에 경과 시간이 출력되는 프로그램 작성
 *  0 분 1초
 *  0 분 2초
 *  ...
 *  1 분 1초
 *  ...
 */
public class QuizMain2 {
    public static void main(String[] args) {
        System.out.println("main 메서드가 시작됩니다.");

        int second = 1, minute = 0;
        while (true) {
            if (second == 60) { minute++; second=0;}
            else second++;
            try {
                Thread.sleep(100);
                System.out.printf("%d분 %d초 %n", minute, second);
            } catch (InterruptedException e) {
                System.out.printf("error: %s", e.getMessage());
                break;
            } finally {
                if (minute == 30) System.out.println("30분이 경과되어 자동 종료됩니다.");
            }
        }
        System.out.println("main 메서드가 종료됩니다.");
    }
}
