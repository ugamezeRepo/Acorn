package test.main;

import java.io.*;

public class MainClass06 {
    public static void main(String[] args) {
        PrintStream ps = System.out;
        OutputStream os = ps;
        OutputStreamWriter osw = new OutputStreamWriter(os);
        // 조금 더 좋은 기능을 가지고있는 BufferedWritter 객체 사용해보기
        BufferedWriter bw = new BufferedWriter(osw);

        try {
            bw.write("하나\r\n");
            bw.write("두울");
            bw.newLine(); // 운영체제에 맞는 개행기호를 자동으로 출력
            bw.write("세엣");
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
