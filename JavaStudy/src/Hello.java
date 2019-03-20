import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력하시오. = > ");
		int num1 = s.nextInt();
		int count = 0;
		int count2 = 0;
		for (int i = 1; i <= num1; i++) {
			int num = i;
			int num2 = i;
			
			while (num > 0) {
				int num3 = num % 10;
				if (num3 == 8) {
					count++;
				}

				num = num / 10;
			}
		
			if (num2 % 4 == 0) {
				count2++;
			}
		}
		System.out.println();
		System.out.println("8의 개수 : " + count);

		System.out.println();
		System.out.println("4의 배수의 개수 : " + count2);

	}
}
