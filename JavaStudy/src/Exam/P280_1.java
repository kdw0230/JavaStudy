package Exam;

public class P280_1 {
	public static void main(String[] args) {
		P280_0 a = new P280_0();
		boolean result = a.login("hong", "12345");
		if(result) {
			System.out.println("로그인되었습니다.");
			a.logout("hong");
		}else {
			System.out.println("id또는 password가 올바르지 않습니다.");
		}
	}
}
