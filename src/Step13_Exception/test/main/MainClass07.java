package Step13_Exception.test.main;

import java.io.File;
import java.io.IOException;

public class MainClass07 {
    public static void main(String[] args) {
        /*
         *  현재 존재하거나 혹은 존재하지 않는 파일이나 폴더를 제어 할수 있는 File 객체를 생성해서
         *  참조값을 f 라는 지역변수에 담기
         */
        File f=new File("c:/acorn202310/myFolder/memo.txt");

        // File 객체의 메소드를 활용해서
        // 실제 memo.txt 파일이 존재하지 않으면 파일을 만들고
        // 존재하면 memo.txt 파일을 삭제하도록 프로그래밍해 보세요.
        try {
            if(f.exists()) {
                f.delete();
                System.out.println("memo.txt 파일을 삭제 했습니다.");
            }else {
                f.createNewFile();
                System.out.println("memo.txt 파일을 만들었습니다.");
            }

        } catch (IOException e) {

            e.printStackTrace();
        }
        System.out.println("main 메소드가 종료됩니다.");
    }
}