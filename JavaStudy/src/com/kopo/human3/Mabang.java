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
//		System.out.print("2보다큰 홀수 입력 > ");
//		num = s.nextInt();
		mabang = new int[num][num];
		int x = 0;
		int y = num / 2; 
		mabang[x][y] = 1;	// 처음 시작 1 좌표 설정
		for (int index = 2; index <= num * num; index++) {
			x = x - 1;
			y = y - 1;
			if (x < 0) {
				if (y < 0) { //모서리
					x = x + 2;
					y = y + 1;
				} else { //위쪽으로 넘어갔을 경우
					x = x + num;
				}
			} else {
				if (y < 0) { // 왼쪽으로 넘어갔을 경우
					y = y + num;
				} else { // 5X5칸 안에서의 경우
					if (mabang[x][y] != 0) {//숫자가 있을때
						x = x + 2;
						y = y + 1;
					} else {
					}
				}

			}
			//if문과 연산을 많이 해서 좋지 않은 코드
			
//			if (x < 0 && y < 0) {
//				x = x + 2;
//				y = y + 1; // 모서리
//			} else if (x < 0 && y >= 0) {
//				x = x + num; //위쪽으로 넘어갔을때
//			} else if (x >= 0 && y < 0) {
//				y = y + num; // 왼쪽으로 넘어갔을때
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
		//for문
//		for (int i = 0; i < mabang.length; i++) {
//			for (int j = 0; j < mabang[i].length; j++) {
//				System.out.print(mabang[i][j] + "\t");
//			}
//			System.out.println();
//		}
		//향상된 for문 
		//for( 변수 : 배열 ){   << 배열 크기만큼 반복
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