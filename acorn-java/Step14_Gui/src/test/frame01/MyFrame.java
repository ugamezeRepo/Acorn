package test.frame01;

import javax.swing.*;

public class MyFrame extends JFrame{
  public MyFrame() {
    // Frame 제목 설정
    this.setTitle("나의 프레임");
    // Frame 위치 및 크기 설정
    this.setBounds(300, 150, 500, 500);
    // Frame의 x버튼을 눌렀을 때, 프로세스 종료 설정
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // 레이아웃 매니저는 아직 사용하지 않겠다 (모든 UI를 절대 좌표에 배치하겠다.)
    setLayout(null);
    // 버튼 하나를 만들어서
    JButton btn1 = new JButton("버튼");
    // 위치를 설정하고 (x, y)
    btn1.setLocation(10, 10);
    // 크기도 설정하고 (width, height)
    btn1.setSize(100, 30);
    // 프레임에 추가
    add(btn1);

    // 버튼에 등록할 ActionListener 객체의 참조값을 얻어 listener에 대입
//    ActionListener listener = new ActionListener() {
//      @Override
//      public void actionPerformed(ActionEvent e) {
//        System.out.println("버튼을 눌렀네~");
//      }
//    };

    btn1.addActionListener((e) -> {
      System.out.println("안녕!");
      // 알림창 띄우기
      JOptionPane.showMessageDialog(MyFrame.this, "버튼을 눌렀네영");
    });

    // Quiz. 첫 버튼 옆에 같은 크기의 버튼을 생성해 비슷한 동작 구현
    JButton btn2 = new JButton("버튼2");
    btn2.setLocation(110, 10);
    btn2.setSize(100, 30);
    add(btn2);
    btn2.addActionListener(e -> {
      System.out.println("요기잉네~");
      JOptionPane.showMessageDialog(this, "너가 술래!");
    });

    this.setVisible(true);
  }

  public static void main(String[] args) {
    System.out.println("main 메서드가 시작됩니다.");

    // MyFram 객체 생성
    new MyFrame();

    System.out.println("main 메서드가 종료됩니다.");
  }
}
