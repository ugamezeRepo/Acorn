package Step16_InputOutput.test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass09 {
    public static void main(String[] args) {
        final String FILE_PATH = "C:\\Users\\acorn\\Desktop\\OtherCom\\myFolder\\";
        String ORIGIN_IMAGE = "1.jpg";
        String COPIED_IMAGE = "copied.jpg";
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            // 파일에서 byte를 읽어들일 때 사용하는 객체
            fis = new FileInputStream(FILE_PATH+ORIGIN_IMAGE);
            // byte를 파일에 출력할 때 사용하는 객체
            fos = new FileOutputStream(FILE_PATH+COPIED_IMAGE);
            // byte 알갱이를 읽어낼 배열을 미리 준비하기
            byte[] buffer = new byte[1024];

            while (true) {
                // byte[]를 전달해 byte 알갱이를 한 번에 1024개씩 읽는다.
                int readedCount = fis.read(buffer); // 읽어들인 개수 리턴
                System.out.printf("%s만큼 읽었습니다.%n", readedCount);
                if (readedCount == -1) break; // 더이상 읽은 데이터가 없으면 탈출
                // byte[] 배열에 저장된 byte 알갱이를 0번 인덱스로부터 읽은 개수만큼 출력
                fos.write(buffer, 0, readedCount);
                fos.flush();

            }
            System.out.println("파일을 copy했습니다.");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                // null 체크를 하며 close
                if (fis != null) fis.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
