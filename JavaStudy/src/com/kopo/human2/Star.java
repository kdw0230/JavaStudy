package com.kopo.human2;

public class Star {
	public static void main(String[] args) {
		Star st = new Star();
		st.star();
	}
	
	public void star() {
		for(int i = 0 ; i<9 ; i++) {
			for(int j = 0 ; j<9 ; j++) {
				if(i==0&&j==4) {
					System.out.print("��");
				}
				else if(i+j==4||i-j==4||i+j==12||j-i==4) {
					System.out.print("��");
				}else {
					System.out.print("    ");
				}
			}
			System.out.println();
		}
	}
}
