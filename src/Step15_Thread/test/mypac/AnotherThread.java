package Step15_Thread.test.mypac;

/**
 *  새로운 스레드 만드는 방법
 *  1. Thread 클래스를 상속받은 클래스 정의
 *  2. run() 메서드 오버라이드
 *  3. run() 메서드 내 새로운 스레드에서 작업 작성
 *  4. 만든 클래스로 객체 생성 후 해당 객체의 start() 메서드 호출 시 새로운 스레드 시작
 */
public class AnotherThread extends Thread{
    @Override
    public void run() {
        System.out.println("작업을 시작합니다.");
        //10 초가 걸리는 작업이라고 가정 하자
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }

        System.out.println("작업이 끝났습니다.");
    }
}
