package ch04;

public class Exam4_6 {
	public static void main(String[] args) {

//	int i;
//	int j;
//	for(i=0;i<5;i++) {
//		for(j=0; j<4-i;j++) {
//			System.out.print(" ");
//		}
//		for(j=0;j<=i;j++) {
//			System.out.print("#");
//		}
//		System.out.println();
//	}
	
	int i;
	int j;
	for (i=5;i>0;i--) {
		for(j=0; j<5-i;j++) {
			System.out.print(" ");
		}
		for(j=1; j<=i;j++) {
			System.out.print("#");
		}
		System.out.println();
	}
		
	}
}
