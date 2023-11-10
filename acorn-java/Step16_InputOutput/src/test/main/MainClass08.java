package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class MainClass08 {
    public static void main(String[] args) {
        final String FILE_PATH = "C:\\Users\\acorn\\Desktop\\OtherCom\\myFolder\\";
        String ORIGIN_IMAGE = "1.jpg";
        String COPIED_IMAGE = "copied.jpg";

        try {
            // 파일에서 byte를 읽어들일 때 사용하는 객체
            FileInputStream fis = new FileInputStream(FILE_PATH+ORIGIN_IMAGE);
            // byte를 파일에 출력할 때 사용하는 객체
            FileOutputStream fos = new FileOutputStream(FILE_PATH+COPIED_IMAGE);
            while (true) {
                // 1byte 읽어들여서
                int readedByte = fis.read();
                System.out.println(readedByte);
                // 더이상 읽을 byte가 없으면 탈출
                if(readedByte == -1) break;
                // 읽어들린 1byte 출력
                fos.write(readedByte);
                fos.flush();
            }
            System.out.println("파일을 copy했습니다.");
            fis.close();
            fos.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
