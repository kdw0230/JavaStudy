package Exam;

public class P280_0_1 {
	public static void main(String[] args) {
		P280 a = new P280();
		boolean result = a.login("hong", "12345");
		if(result) {
			System.out.println("�α��εǾ����ϴ�.");
			a.logout("hong");
		}else {
			System.out.println("id�Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}
	}
}
