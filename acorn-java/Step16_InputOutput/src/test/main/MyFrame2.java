package test.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class MyFrame2 extends JFrame implements ActionListener {
    static final String FILE_PATH = "C:\\Users\\acorn\\Desktop\\OtherCom\\myFolder\\";
    static final String DIARY_TXT = "diary.txt";
    JTextField inputMsg;
    JLabel label;
    // Frame의 제목을 전달받는 생성자
    public MyFrame2(String title) {
        super(title); // 부모 생성자에 프레임의 제목 전달하기

        setBounds(100, 100, 500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 문자열을 한 줄 입력받을 수 있는 JTextField 객체 생성
        this.inputMsg = new JTextField(20);
        JButton saveBtn = new JButton("저장");

        saveBtn.addActionListener(this);

        // UI를 감쌀 패널
        JPanel p1 = new JPanel();
        // 패널에 UI 배치
        p1.add(inputMsg);
        p1.add(saveBtn);
        // 패널을 프레임의 남쪽에 추가
        this.add(p1, BorderLayout.SOUTH);
        p1.setBackground(Color.YELLOW);
        // 여러 줄의 문자열을 출력하거나 입력할 수 있는 JTextArea
        JTextArea ta = new JTextArea();
        JButton readBtn = new JButton("읽어오기");

        add(ta, BorderLayout.CENTER);
        p1.add(readBtn);

        readBtn.addActionListener(e -> {
            // JTextArea에 출력된 내용을 빈 문자열로 덮어쓰기(삭제) 한 다음
            ta.setText("");
            FileReader fr = null;
            BufferedReader br = null;
            try {
                // 파일에서 문자열을 읽어들일 객체
                fr = new FileReader(FILE_PATH+DIARY_TXT);
                // 문자열을 좀 더 편하게 읽어들이기 위해 FileReader를 Buffered Reader로 포장
                br = new BufferedReader(fr);
                while (true) {
                    // 문자열 한 줄 씩 읽어온다.
                    String line = br.readLine();
                    // 더 읽어올 문자열이 없을 경우
                    if (line == null) break; // 탈출
                    ta.append(line);
                    ta.append("\r\n");
                }
            } catch (Exception ex) {
                throw new RuntimeException(ex);
            }
        });

        JButton deleteBtn = new JButton("파일 삭제");
        p1.add(deleteBtn);
        deleteBtn.addActionListener(e -> {
            int deleteFile = JOptionPane.showConfirmDialog(this, "징쨔임?");

            if (deleteFile == JOptionPane.YES_OPTION ) {
                // diary.txt 파일을 제어할 수 있는 File 객체 생성
                File f = new File(FILE_PATH+DIARY_TXT);
                f.delete();
            }
        });
    }

    public static void main(String[] args) {
        MyFrame2 f = new MyFrame2("나의 프레임6");

        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = this.inputMsg.getText();
    }
}
