package ch07.exam;

public class BloodHouse {

	public boolean isPossible(Human human) {

		int age = 0;// �������� ���̸� Ȯ���Ͽ� ����
		boolean isPossible = false;// ���� ���ɿ���
		/* �Ѱܹ��� Human Ŭ�����κ��� age ���� Ȯ�� age = ? */
		age = human.getAge(); // ���̰�
		/* age�� 16�� �̻� 69�� ���� �϶��� ���� �����ϵ��� ���ǹ� �ۼ� */
		if (age >= 16 && age <= 69) {
			isPossible = true;
		}
		return isPossible;
	}

	public String action(Human human) {
		String result = ""; // ���� ��� ����
		
		/* isPossible() �޼ҵ带 Ȱ���Ͽ� ���� ���� ���θ� Ȯ���ϴ� ���ǹ� �ۼ� */
//		String name = "";
//		String type = "";
		String name, type = "";
		name = human.getName();
		type = human.getType();
		//boolean isPossible=isPossible(human)
		//if(isPossible = true){
		if (isPossible(human) == true) {
			result = type + "������ ���������մϴ�.  " + name + "�� �����մϴ�.";
		} else {
			result = "���� �Ұ����Դϴ�.";
		}
		/* ���� ���� �� result = "������ �Ϸ�Ǿ����ϴ�. XX�� �����մϴ�. */
		/* ���� �Ұ� �� result = "������ �Ұ����մϴ�. */
		return result;
	}
}