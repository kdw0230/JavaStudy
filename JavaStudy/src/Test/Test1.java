package Test;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		System.out.print("숫자를 입력하시오. => ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		for (int num2 = 1; num2 <= num; num2++) {
			//System.out.print(num2);
		}//System.out.println();
		for (int i = 0; i<=num; i++) {
			searchEight(i);
		} System.out.println("8의 갯수는 : " + count);
		
		s.close();
		
	
	}
private static int count = 0;
	public static void searchEight(int num) {
		if (num%10==8) count++;
		if (num>10) searchEight(num/10);
		
	}
}
