package Step14_Gui.test.frame04;

import java.awt.BorderLayout;

import javax.swing.*;

public class MyFrame extends JFrame{
  public MyFrame() {
    // Frame 제목 설정
    this.setTitle("나의 프레임");
    // Frame 위치 및 크기 설정
    this.setBounds(300, 150, 500, 500);
    // Frame의 x버튼을 눌렀을 때, 프로세스 종료 설정
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // FlowLayout 매니저 사용해보기
    setLayout(new BorderLayout());

    JButton btn1 = new JButton("버튼1");
    add(btn1, BorderLayout.NORTH);
    JButton btn2 = new JButton("버튼2");
    add(btn2, BorderLayout.EAST);
    JButton btn3 = new JButton("버튼3");
    add(btn3, BorderLayout.SOUTH);
    JButton btn4 = new JButton("버튼4");
    add(btn4, BorderLayout.WEST);
    
    this.setVisible(true);
  }

  public static void main(String[] args) {
    System.out.println("main 메서드가 시작됩니다.");

    // MyFram 객체 생성
    new MyFrame();

    System.out.println("main 메서드가 종료됩니다.");
  }
}
