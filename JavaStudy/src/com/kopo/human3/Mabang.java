package com.kopo.human3;

//import java.util.Scanner;

public class Mabang {
	int num;
	int[][] mabang;

	public Mabang(int num) {
		this.num = num;
	}

	public void start() {
//		Scanner s = new Scanner(System.in);
//		System.out.print("2����ū Ȧ�� �Է� > ");
//		num = s.nextInt();
		mabang = new int[num][num];
		int x = 0;
		int y = num / 2; 
		mabang[x][y] = 1;	// ó�� ���� 1 ��ǥ ����
		for (int index = 2; index <= num * num; index++) {
			x = x - 1;
			y = y - 1;
			if (x < 0) {
				if (y < 0) { //�𼭸�
					x = x + 2;
					y = y + 1;
				} else { //�������� �Ѿ�� ���
					x = x + num;
				}
			} else {
				if (y < 0) { // �������� �Ѿ�� ���
					y = y + num;
				} else { // 5X5ĭ �ȿ����� ���
					if (mabang[x][y] != 0) {//���ڰ� ������
						x = x + 2;
						y = y + 1;
					} else {
					}
				}

			}
			//if���� ������ ���� �ؼ� ���� ���� �ڵ�
			
//			if (x < 0 && y < 0) {
//				x = x + 2;
//				y = y + 1; // �𼭸�
//			} else if (x < 0 && y >= 0) {
//				x = x + num; //�������� �Ѿ����
//			} else if (x >= 0 && y < 0) {
//				y = y + num; // �������� �Ѿ����
//			} else {
//				if (mabang[x][y] != 0) {
//					x = x + 2;
//					y = y + 1;
//				} else {
//					
//				}
//			}
			mabang[x][y] = index;
		}
		//for��
//		for (int i = 0; i < mabang.length; i++) {
//			for (int j = 0; j < mabang[i].length; j++) {
//				System.out.print(mabang[i][j] + "\t");
//			}
//			System.out.println();
//		}
		//���� for�� 
		//for( ���� : �迭 ){   << �迭 ũ�⸸ŭ �ݺ�
		for(int[] temp:mabang) {
			for(int present:temp) {
				System.out.print(present+ "\t");
			}
			System.out.println();
		}
		
//		s.close();
	}

	public static void main(String[] args) {
		Mabang ma = new Mabang(5
				);
		ma.start();
	}
}