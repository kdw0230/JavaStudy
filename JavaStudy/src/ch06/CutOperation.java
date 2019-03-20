package ch06;

public class CutOperation {
	public static void main(String[] args) {
		int[] stick = { 1,2,3,4,3,3,2,1 };
		// �ּҰ� 2
		// 1������ => 3 2 2 0 0 6 => 4��
		// 2������ => 1 0 0 -2 -2 4 => 2��
		while (true) {
			// 1�� �ּҰ� �˾Ƴ���
			int min = Integer.MAX_VALUE; // int�� ǥ���Ҽ��ִ� �ִ밪
			for (int i = 0; i < stick.length; i++) {
				// min = stick[i] < min;
				if (stick[i] < min && stick[i]>0) {
					min = stick[i];
				}
			}
			// 2�� �ּҰ����� �迭 ��� ���ҽ�Ű��
			for (int i = 0; i < stick.length; i++) {
				stick[i] = stick[i] - min;
			}

			// 3�� �迭 ��� �� 0���� ū ��� ���� �˾Ƴ���
			int count = 0;
			for (int i = 0; i < stick.length; i++) {
				if (stick[i] > 0) {
					count++;
				}
			}
			System.out.println(count);
			if(count==0) {
				break;
			}
		}
	}
}
