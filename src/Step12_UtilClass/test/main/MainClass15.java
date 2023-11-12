package Step12_UtilClass.test.main;

import java.util.Random;

/**
 *  반복문 While
 */
public class MainClass15 {
    public static void main(String[] args) {
        int count = 0;

        // 무한 반복
//        while (true) {
//            count++;
//            System.out.println(count);
//        }

        // 정해진 횟수만큼 반복
        while (count < 10) {
             System.out.printf("count: %d %n", count);
             count++;
        }

        // 랜덤한 숫자를 얻어낼 Random 객체
        Random ran = new Random();
        int counting = 0;

        // 특정 조건을 만족할 때까지 반복
        while (true) {
            int ranNum = ran.nextInt(100);
            System.out.printf("%d번 째: %d %n", counting+1, ranNum);
            counting++;

            if (ranNum==50) {
                break; // 반복문 탈출
            }
        }

//        boolean isRun = true;
//        while (isRun) {
//            int ranNum = ran.nextInt(100);
//            System.out.printf("%d번 째: %d %n", counting+1, ranNum);
//            if (ranNum==50) {
//                isRun = false;
//            }
//        }


    }
}
