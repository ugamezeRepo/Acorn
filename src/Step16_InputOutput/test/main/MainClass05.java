package Step16_InputOutput.test.main;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class MainClass05 {
    public static void main(String[] args) {
        PrintStream ps = System.out;
        // 학습을 위해 PrintStream 객체를 부모인 OutputStream으로 받기
        // OutputStream도 1byte 처리스트림이다.
        OutputStream os = ps;
        // 2byte 처리 스트림
        OutputStreamWriter osw = new OutputStreamWriter(os);

        try {
            osw.write(44032);
            osw.write("야금");
            osw.write("\r\n");
            osw.write("장고");
            osw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

