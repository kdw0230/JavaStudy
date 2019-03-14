package ch05;

public class Minimum {
	public static void main(String[] args) {
		int[] nums = { 12, 51, 512, 123, 412, 32, 11};
		
		int temp = 0;
		int temp2 = 0;
		//int temp2 = Integer.MAX_VALUE; //최대값(?)
		
		for(int i = 0; i < nums.length; i++) {
			if(temp > nums[i] || temp == 0) {
				temp = nums[i];
			}
			if(temp2 < nums[i] || temp2 ==0) {
				temp2 = nums[i];
			}
		}
		System.out.println("최소값: "+ temp);
		System.out.println("최대값: "+ temp2);
	}
}
