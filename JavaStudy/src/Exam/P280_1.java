package Exam;

public class P280_1 {
	public static void main(String[] args) {
		P280_0 a = new P280_0();
		boolean result = a.login("hong", "12345");
		if(result) {
			System.out.println("�α��εǾ����ϴ�.");
			a.logout("hong");
		}else {
			System.out.println("id�Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}
	}
}
