package test.frame06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JTextField inputMsg;
    JLabel label;
    // Frame의 제목을 전달받는 생성자
    public MyFrame (String title) {
        super(title); // 부모 생성자에 프레임의 제목 전달하기

        setBounds(100, 100, 500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        // 문자열을 한 줄 입력받을 수 있는 JTextField 객체 생성
        this.inputMsg = new JTextField(20);
        JButton sendBtn = new JButton("전송");
        JButton sendBtn2 = new JButton("전송2");
        this.label = new JLabel("...");


        // JTextField에 문자열을 입력하고 전송버튼을 누르면
        sendBtn.addActionListener(e -> {
            String text = inputMsg.getText();
            // 1. 입력한 문자열이 콘솔창에 출력되도록 해보세요.
            System.out.println(text);
            // 2. 입력한 문자열이 알림창에 출력되도록 해보세요.
            JOptionPane.showMessageDialog(this, text);
            label.setText(text);
        });
        // hint: JTextField 객체의 .get~~~() 메서드 이용

        sendBtn2.addActionListener(this);

        add(inputMsg);
        add(sendBtn);
        add(sendBtn2);
        add(new JPanel());
        add(this.label);
    }

    public static void main(String[] args) {
        MyFrame f = new MyFrame("나의 프레임6");

        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String text = this.inputMsg.getText();

        System.out.println(text);
        JOptionPane.showMessageDialog(this, text);
        this.label.setText(text);
    }
}
