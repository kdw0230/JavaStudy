package ch03;

public class Operation5 {
	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		boolean result;
		result = num1++ < 0 && num2++ > 0;
		//'num1++ < 0' 이 거짓이기 때문에 뒤의 num2++은 실행되지 않는다.
		//&일 경우에는 뒤의 식 까지 실행 됨
		System.out.println(num1);//1
		System.out.println(num2);//0
		
		
		
		
	}
}
