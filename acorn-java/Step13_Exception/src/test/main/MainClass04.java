package test.main;

/**
 *  [ Compile 단계 Exception ]
 *  Runtime 단계 이전인 Compile 단계에서 일어나는 예외는
 *  항상 try-catch문으로 묶어줘야한다.
 */
public class MainClass04 {
    public static void main(String[] args) {
        System.out.println("main 메서드가 시작됩니다.");

        try {
            // 스레드를 일정 시간 지연( milli-second 단위로 전달)
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("main 메서드가 종료됩니다.");
    }
}
