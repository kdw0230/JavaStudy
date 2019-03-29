package com.kopo.human2;

import java.util.Scanner;

class MabangJin {
	
	public void start() {
		Scanner s = new Scanner(System.in);
		System.out.print("2보다 크고 16보다 작은 홀수 입력 > ");
		int n = s.nextInt();
		int[][] arr = new int[n][n];
		int x = 0, y = n / 2; // 처음 1시작
		for (int a = 1; a <= n * n; a++) {
			arr[x][y] = a;
			if (a % n == 0) {
				x++;
			} else {
				x--;
				y--;
				if (x < 0) {
					x = n - 1;
				} else if (y < 0) {
					y = n - 1;
				}
			}
		}
//		for (int i = 0; i < 5; i++) {
//			for (int j = 0; j < 5; j++) {
//				System.out.print(arr[i][j] + "\t");
//			}
//			System.out.println();
//		}
		// 향상된 for문
		for (int[] i : arr) {
			for (int j : i) {
				System.out.print(j + "\t");
			}
			System.out.println();
		}
		s.close();
	}

	public static void main(String[] args) {
		MabangJin ma = new MabangJin();
		ma.start();
	}
}
