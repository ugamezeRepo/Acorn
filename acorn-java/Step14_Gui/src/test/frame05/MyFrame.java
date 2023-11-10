package test.frame05;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {
  JButton sendBtn, updateBtn, deleteBtn;

  public MyFrame() { 
    // Frame 제목 설정
    this.setTitle("나의 프레임");
    // Frame 위치 및 크기 설정
    this.setBounds(300, 150, 500, 500);
    // Frame의 x(닫기)버튼을 눌렀을 때, 프로세스 종료 설정
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // FlowLayout 매니저 사용해보기
    setLayout(new FlowLayout());

    JButton sendBtn = new JButton("전송");
    JButton updateBtn = new JButton("수정");
    JButton deleteBtn = new JButton("삭제");

    this.sendBtn = sendBtn;
    this.updateBtn = updateBtn;
    this.deleteBtn = deleteBtn;

    sendBtn.addActionListener(this);
    updateBtn.addActionListener(this);
    deleteBtn.addActionListener(this);

    // this의 type 다형성 확인
    Object a = this;
    JFrame b = this;
    MyFrame c = this;
    ActionListener d = this;

    add(sendBtn);
    add(updateBtn);
    add(deleteBtn);
    
    this.setVisible(true);
  }

  public static void main(String[] args) {
    System.out.println("main 메서드가 시작됩니다.");

    // MyFram 객체 생성
    new MyFrame();

    System.out.println("main 메서드가 종료됩니다.");
  }
  @Override
  public void actionPerformed(ActionEvent e) {
    // 눌러진 버튼의 Action Command 문자열을 읽어온다. (default: 버튼의 텍스트)
//    String command = e.getActionCommand();
//
//    switch (command) {
//      case "전송":
//        System.out.println("전송합니다.");
//        break;
//      case "수정":
//        System.out.println("수정합니다.");
//        break;
//      case "삭제":
//        System.out.println("삭제합니다.");
//        break;
//      default:
//        break;
//    }

    // 위와 동일한 동작을 아래의 매서드가 리턴해주는 Object의 참조값을
    // 활용하는 구조로 MyFrame 클래스 수정
    // hint: 필드를 활용!
    Object obj = e.getSource();

    if (obj == this.sendBtn) System.out.println("전송합니다.");
    if (obj == this.updateBtn) System.out.println("수정합니다.");
    if (obj == this.deleteBtn) System.out.println("삭제합니다.");
  }
}