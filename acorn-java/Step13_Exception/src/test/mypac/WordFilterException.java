package test.mypac;

public class WordFilterException extends RuntimeException {
  // 생성자의 인자로 예외 메세지를 전달 받아
  public WordFilterException(String msg) {
    super(msg); // 부모 생성자에 전달하 객체 생성
  }
}
