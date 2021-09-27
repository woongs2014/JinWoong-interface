package 인터페이스기초;

public interface Codable {
	//수정수정~~
	// #interface // 마치, 함수를 모아놓는 것들? class인데 여러개 자유롭게 쓰는 것들? ->이름을 자유롭게 선언해서 이용한다.
	//1. 객체 생성이 불가능하다.
	//2. 추상메소드만 가질 수 있다.
	//자바8버전 ---> default or static을 추가하면 일반 method을 가질 수 있다. (but 자주 안씀)
	//3. 필드 안에 반드시 상수만 가질 수 있다.
	
	
//	#다중구현 가능/ 상속도 받을 수 잇다./ ovrride강제성
	
	public abstract void coding(); // abstract 없어도 자동으로 -> 추상method로 인식가능
	

}
