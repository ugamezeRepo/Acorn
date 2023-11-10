package test.main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainClass03 {
    public static void main(String[] args) {
        InputStream is = System.in;
        InputStreamReader isr = new InputStreamReader(is);

        BufferedReader br = new BufferedReader(isr);
        String line;

        System.out.print("문자열 한 줄 입력: ");
        try {
            line = br.readLine();
            System.out.println("line: " + line);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
