package Step08_Extends.test.mypac;

public class SmartPhone extends HandPhone{
	// 생성자
	public SmartPhone() {
		System.out.println("SmartPhone 생성자 호출됨.");
	}
	// 메소드
	public void doInternet() {
		System.out.println("인터넷을 해요.");
	}
	
	// 재정의. @Override는 재정의되었다고 단순히 표시하는 용도, 특별한 기능 X(없어도 되지만 코드 분석을 위해 남겨두자.)
	@Override
	public void takePicture() {
		System.out.println("1000만 화소의 사진을 찍어요!");
	}	
}
