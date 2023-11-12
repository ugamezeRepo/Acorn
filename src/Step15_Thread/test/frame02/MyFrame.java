package Step15_Thread.test.frame02;

import Step15_Thread.test.mypac.AnotherThread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 *  일괄 import 하는 방법  ctrl + shift + o
 */
public class MyFrame extends JFrame implements ActionListener{
    //생성자
    public MyFrame(String title) {
        super(title);
        //프레임의 초기 설정 작업하기
        setBounds(100, 100, 500, 500);
        // 이프레임(MyFrame)의 x 버튼 (close 버튼) 을 눌렀을때 프로세스도 같이 종료 되도록 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //레이아웃 설정
        setLayout(new FlowLayout());

        JButton startBtn=new JButton("작업 시작");
        startBtn.addActionListener(this);
        //프레임에 버튼 추가
        add(startBtn);

        JTextField tf=new JTextField(10);
        //프레임에 JTextField 추가
        add(tf);

        // 프레임을 화면상에 실제 보이게 하기( false 하면 화면에 보이지 않는다 )
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // 새로운 스레드를 시작해서 작업 실행
        new AnotherThread().start();
        System.out.println("복잡한 작업은 새로운 스레드에서 시작시키고 main 스레드는 바로 리턴됩니다.");
    }
    // run 했을때 app 이 시작되는 아주 특별한 main 메소드
    public static void main(String[] args) {
        System.out.println("main 메서드가 시작됩니다.");
        new MyFrame("나의 프레임");
        System.out.println("main 메서드가 종료됩니다.");
    }
}
