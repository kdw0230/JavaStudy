package ch05;

public class Exam5_1 {
	public static void main(String[] args) {
		//			  0, 1, 2, 3, 
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		
		String sep = "";
		
		for (int i = 0; i < arr.length; i++) {
		//	if (i % 2 == 0) {
			if (arr[i] % 2 != 0) {
				System.out.print(sep + arr[i]);
				sep = ",";
			}
		}
		System.out.println();
		
		String sep1 = "";
		
		for(int i = 1 ; i< arr.length ; i += 2) {
			System.out.print(sep1 + arr[i]);
			sep1 = ",";
		}
	}
}
