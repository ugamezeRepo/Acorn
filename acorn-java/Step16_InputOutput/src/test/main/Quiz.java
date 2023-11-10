package test.main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Quiz {
    public static void main(String[] args) {
        IOFrame frame = new IOFrame("니 내 아니?");

        frame.setVisible(true);
    }
}

class IOFrame extends JFrame implements ActionListener {
    TextField memoTitle,inputMsg;
    JLabel label = new JLabel();

    public IOFrame(String title) {
        super(title);

        setDefaultSetting();

        this.memoTitle = new TextField(20);
        JButton meomoTitleBtn = new JButton("메모장 이름을 입력하세요");
        this.inputMsg = new TextField(30);
        JButton inputMsg = new JButton("내용 추가");

        inputMsg.addActionListener(this);

        setVisible(true);

        add(memoTitle);
        add(meomoTitleBtn);
        add(this.inputMsg);
        add(inputMsg);
        add(this.label);
    }

    private void setDefaultSetting () {
        setBounds(100, 100, 500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = this.inputMsg.getText();

        FileA file = new FileA();
        file.setMsg(text);
        file.fileWrite();

        JOptionPane.showMessageDialog(this, "내용을 추가했습니다.");
        this.label.setText(text);
    }
}

class FileA {
    final String FILE_PATH = "C:\\Users\\acorn\\Desktop\\OtherCom\\myFolder\\";
    String txtTitle = "tmp.txt";
    String msg;
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public void fileWrite() {
        File f = new File(this.FILE_PATH+this.txtTitle);
        try {
            if (!f.exists()) {
                f.createNewFile();
                System.out.println("새로운 txt파일을 만들었습니다.");
            }
            FileWriter fw = new FileWriter(f, true);
            fw.write(this.msg);
            fw.write("\r\n");
            fw.flush();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}