package ch05;

public class Bingo {
	public static void main(String[] args) {
		int[] bingo = new int [25];
		for(int i = 0 ; i < bingo.length ; i++) {
			bingo[i] = i+1;
		}
		//���� �����ֱ�(����)
		
		for(int i = 0 ; i < 1000 ; i++) {
			int random = (int) (Math.random() * bingo.length);
			bingo[0] = bingo[random];
			int temp = bingo[0];
			bingo[random] = temp;
		}
		//���� ���
		for(int i = 0 ; i < bingo.length ; i++) {
			System.out.print(bingo[i] + "\t");
			if((i+1)%5 == 0) {
				System.out.println();
			}
		}
	}
}
