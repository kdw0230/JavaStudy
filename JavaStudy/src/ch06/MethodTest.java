package ch06;

public class MethodTest {
	public static int firstMethod() {
		//������� 2��, 4��
		int a = 100;
		return a;
		// == return 100;
	}

	// �޼ҵ� ���� ��Ģ
	// �ݵ�� Ŭ���� ���� ǥ���Ǿ�� �Ѵ�.
	// �޼ҵ� ���� ǥ���� �� ����.
	// ��ġ ��� ����.
	public static void main(String[] args) {
		//������� 1��
		System.out.println(firstMethod());
		//������� 3��
		int num = firstMethod(); // �������� Ÿ�Ը� ������ �ƹ��ų� ��� X
		//������� 5��
		System.out.println(num * 6);

	}
}