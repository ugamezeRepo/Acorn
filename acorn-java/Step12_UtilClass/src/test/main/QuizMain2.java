package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Dto;

/*
 *	글 목록을 ArrayList에 대입 
 *	글 하나는 글번호, 작성자, 제목으로 이루어져있다고 가정
 *	글 3개의 정보를 ArrayList에 대입 후 반복문으로 출력
 *	글 하나를 담을 dto 클래스를 생성( 클래스명, 필드명)
 */

public class QuizMain2 {
	public static void main(String[] args) 	{
		List<Dto> list = new ArrayList<Dto>();
		
		list.add(new Dto(1, "송태정", "별 하나에 추억과"));
		list.add(new Dto(2, "김태준", "별 하나에 사랑과"));
		list.add(new Dto(3, "김혜란", "별 하나에 쓸쓸함과"));
		
		list.forEach(tmp -> System.out.printf("글번호: %2d, 작성자: %3s, 제목: %s %n", tmp.getNum(), tmp.getName(), tmp.getTitle()));
	}
	
}
