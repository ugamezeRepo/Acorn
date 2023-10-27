package test.main;

@SuppressWarnings("unused")
public class MainClass02 {
	public static void main(String[] args) {
		// Quiz. 점수 평균 구하기.
		// 1. 콘솔 창에 "main 메서드가 시작되었습니다."를 출력.
		System.out.println("main 메서드가 시작되었습니다.");
		// 2. 국어점수 95를 kor 변수에 담기.
		int kor = 95;
		// 3. 영어점수 100을 eng 변수에 담기.
		int eng = 100;
		// 4. 국어 점수와 영어 점수의 평균을 구해(연산자 활용) avg 변수에 담기.
		double avg = (kor+eng)/ 2;
		// 5. 콘솔 창에 avg 변수의 내용 출력. 
		System.out.println(avg); // avg:97 -> 정수끼리만 계산하면 실수부분이 잘린다.
		double avg2 = (kor+eng)/ 2d;
		// 5. 콘솔 창에 avg 변수의 내용 출력. 
		System.out.println(avg); // avg:97.5 -> (double)(kor+eng), 2d, 2.0 어느것이든 실수가 생기면 된다.
	}
}
