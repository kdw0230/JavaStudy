package ch07.exam;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/* ������ ���� */
		Scanner s = new Scanner(System.in);

		System.out.print("�̸��� �Է��Ͻÿ�. >>");
		String a = s.next();

		System.out.print("���̸� �Է��Ͻÿ�. >>");
		int b = s.nextInt();

				
		System.out.print("�������� �Է��Ͻÿ�. >>");
		String c = "";
		while (true) {
			try {
				c = s.next();
				String type = c.intern();
				if (type == "a" || type == "A" || type == "b" || type == "B" || type == "o" || type == "O"
						|| type == "ab" || type == "AB") {
					break;
				} else {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.print("�߸��� ���Դϴ�. �ٽ� �Է����ּ���. >>");

			}
		}
		while (true) {
			c = s.next();
			String type = c.intern();
			if (type == "a" || type == "A" || type == "b" || type == "B" || type == "o" || type == "O" || type == "ab"
					|| type == "AB") {
				break;
			} else {
			System.out.print("�߸��� ���Դϴ�. �ٽ� �Է����ּ���. >>");
			}

		}
//		Test test = new Test();

		Human human = new Human();
		human.setName(a);
		human.setAge(b);
		human.setType(c);

		/* BloodHouse ��ü ���� */
		BloodHouse bh = new BloodHouse();

		String result = bh.action(human); // action() �޼ҵ� ȣ�� ��� ����
		// String result = "";
		// result = bh.action(human);

		/* action() �޼ҵ带 ȣ���ϸ鼭 �Ű������� ������ ���� �Ѱ��� */
		/* action() �޼ҵ� ȣ�� ��� ��� */
		System.out.println(result);
	}
}