package ch06;

import java.util.Calendar;

public class Exam6_3_4 {
	public static void main(String[] args) {
		
		System.out.println(dilemma(true, true));
		System.out.println(dilemma(true, false));
		System.out.println(dilemma(false, true));
		System.out.println(dilemma(false, false));
		
		
	}
	public static String dilemma(boolean xa, boolean xb) {
		String result = "";
		if(xa==true && xb==true) { 
			result = "A,B �Ѵ� 5�� ����";
		}
		else if(xa && !xb) {
			result = "A ����, B 10�� ����";
		}
		else if(!xa && xb==true) {
			result = "A 10�� ����, B ����";
		}
		else {
			result = "A,B�Ѵ� 1�� ����";
		}
		return result;
	}
}
