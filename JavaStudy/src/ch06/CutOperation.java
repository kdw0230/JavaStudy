package ch06;

public class CutOperation {
	public static void main(String[] args) {
		int[] stick = { 1,2,3,4,3,3,2,1 };
		// 최소값 2
		// 1번연산 => 3 2 2 0 0 6 => 4개
		// 2번연산 => 1 0 0 -2 -2 4 => 2개
		while (true) {
			// 1번 최소값 알아내기
			int min = Integer.MAX_VALUE; // int로 표현할수있는 최대값
			for (int i = 0; i < stick.length; i++) {
				// min = stick[i] < min;
				if (stick[i] < min && stick[i]>0) {
					min = stick[i];
				}
			}
			// 2번 최소값으로 배열 요소 감소시키기
			for (int i = 0; i < stick.length; i++) {
				stick[i] = stick[i] - min;
			}

			// 3번 배열 요소 중 0보다 큰 요소 개수 알아내기
			int count = 0;
			for (int i = 0; i < stick.length; i++) {
				if (stick[i] > 0) {
					count++;
				}
			}
			System.out.println(count);
			if(count==0) {
				break;
			}
		}
	}
}
