package com.kopo.human2;

//public abstract class Elec { // class�� ũ��� ������ ũ�� = int���� 3�� >> 12byte

////	private int j = 9; //private = �ڱ� �ڽ��� Ŭ���� �������� ������ ����
////	int i = 7; //�ƹ��� ���� �����ڸ� ������� ������, default���� �� = ������ ��Ű�� �������� ���� ����
////	public int k = 11; //public = ������ ������ ����.

//	public abstract void volumeUp();
////	{
////		System.out.println("�̰��� Elec�� ������");
////	}
//	public void volumeDown() {
//		System.out.println("�̰��� Elec�� �����ٿ�");
//	}
//}
public interface Elec{
	public static final int i = 9;
	
	public void volumeUp();
	
	public void volumeDown();
	
}
