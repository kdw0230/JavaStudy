package ch06;

public class MethodTest {
	public static int firstMethod() {
		//실행순서 2번, 4번
		int a = 100;
		return a;
		// == return 100;
	}

	// 메소드 생성 규칙
	// 반드시 클래스 내에 표현되어야 한다.
	// 메소드 내에 표현할 수 없음.
	// 위치 상관 없음.
	public static void main(String[] args) {
		//실행순서 1번
		System.out.println(firstMethod());
		//실행순서 3번
		int num = firstMethod(); // 변수명은 타입만 맞으면 아무거나 상관 X
		//실행순서 5번
		System.out.println(num * 6);

	}
}
