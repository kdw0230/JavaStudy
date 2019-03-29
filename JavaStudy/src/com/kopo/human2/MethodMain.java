package com.kopo.human2;

public class MethodMain {
	public static void main(String[] args) {

		Send se = new Send(10);
		se.send();

		System.out.println();
		Mp3 a = new Mp3();
		se.sendObject(a);
		System.out.println(a.i);
		
		SingleTonTest.getInstance();
		SingleTonTest stt = SingleTonTest.getInstance();

//		System.out.println();
//		se.sendObject(new Tv());
//
//		System.out.println();
//		se.sendObject(new Radio());
	}
}
