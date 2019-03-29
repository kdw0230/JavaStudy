package com.kopo.human2;

//public abstract class Elec { // class의 크기는 변수의 크기 = int변수 3개 >> 12byte

////	private int j = 9; //private = 자기 자신의 클래스 내에서만 접근이 가능
////	int i = 7; //아무런 접근 제한자를 명시하지 않으면, default값이 됨 = 동일한 패키지 내에서만 접근 가능
////	public int k = 11; //public = 접근을 제한이 없음.

//	public abstract void volumeUp();
////	{
////		System.out.println("이것은 Elec의 볼륨업");
////	}
//	public void volumeDown() {
//		System.out.println("이것은 Elec의 볼륨다운");
//	}
//}
public interface Elec{
	public static final int i = 9;
	
	public void volumeUp();
	
	public void volumeDown();
	
}
