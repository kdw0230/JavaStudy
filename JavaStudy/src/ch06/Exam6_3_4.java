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
			result = "A,B 둘다 5년 복역";
		}
		else if(xa && !xb) {
			result = "A 석방, B 10년 복역";
		}
		else if(!xa && xb==true) {
			result = "A 10년 복역, B 석방";
		}
		else {
			result = "A,B둘다 1년 복역";
		}
		return result;
	}
}
