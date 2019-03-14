import java.util.Scanner;

public class GitTest {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("ют╥б>> ");
		int num = s.nextInt();
		int count = 0;
		
		
		for (int i = 1 ; i <= num ; i++) {
			int num1 = i;
			if(num1 % 4 ==0) {
				count++;
			}
			
		}System.out.println(count);
	}
}
