package ch04;

import java.util.Scanner;

public class FindNumber {
	public static void main(String[] args) {
		int count = 0;
		int start = 60;
		int range = 20;
		int random = (int)(Math.random()*range + start);//60~79
				
		Scanner s = new Scanner(System.in);
		while(true) {
			System.out.print("입력 : ");
			int num = s.nextInt();
			count = count + 1;
			
			if((start > num)  || ((range + (start-1)) < num)) {
				System.out.println("범위 벗어남");
			}
			else if(random == num) {
				System.out.println("맞혔음");
				break;
			}
			else if(random >num) {
				System.out.println("큰수를 입력하세요");
			}
			else {System.out.println("작은수를 입력하세요");
			}
		}
		System.out.println("시도 횟수 : " + count);
		
		
		s.close();
				
	}
}
