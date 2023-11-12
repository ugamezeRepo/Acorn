package Step14_Gui.test.Quiz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcFrameA extends JFrame implements ActionListener {
    JTextField tf_num1, tf_num2;
    JLabel la2;
    public CalcFrameA(String title) {
        super(title);

        setBounds(100, 100, 900, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        //JTextField 2개
        tf_num1=new JTextField(10);
        tf_num2=new JTextField(10);

        //JButton 4 개
        JButton plusBtn=new JButton("+");
        JButton minusBtn=new JButton("-");
        JButton multiBtn=new JButton("*");
        JButton divideBtn=new JButton("/");

        //JLabel 2 개
        JLabel la1=new JLabel("=");
        la2=new JLabel("0");

        // UI 를 프레임에 배치
        add(tf_num1);
        add(plusBtn);
        add(minusBtn);
        add(multiBtn);
        add(divideBtn);
        add(tf_num2);
        add(la1);
        add(la2);

        // 버튼에 액션 리스너 등록하기
        plusBtn.addActionListener(this);
        minusBtn.addActionListener(this);
        multiBtn.addActionListener(this);
        divideBtn.addActionListener(this);

        // 버튼에 custom action command 설정하기
        plusBtn.setActionCommand("plus");
        minusBtn.setActionCommand("minus");
        multiBtn.setActionCommand("multi");
        divideBtn.setActionCommand("divide");
    }

    public static void main(String[] args) {
        CalcFrameA cf = new CalcFrameA("간단한 계산기");
        cf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        String strNum1 = tf_num1.getText();
        String strNum2 = tf_num2.getText();

        try {
            double num1 = Double.parseDouble(strNum1);
            double num2 = Double.parseDouble(strNum2);
            double result = 0;
            if( cmd.equals("plus")) {
                result = num1+num2;
            } else if( cmd.equals("minus")) {
                result = num1-num2;
            } else if( cmd.equals("multi")) {
                result = num1*num2;
            } else if( cmd.equals("divide")) {
                if (num2 == 0) {
                    return;
                }
                result = num1/num2;
            }
            la2.setText(Double.toString(result));
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(this, "숫자 형식으로 입력해주세요.");
        }
    }
}
