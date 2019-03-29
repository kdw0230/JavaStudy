package com.kopo.human2;

public class SingleTonTest {
	private SingleTonTest() {

	}

	private static SingleTonTest stt = new SingleTonTest();

//	public SingleTonTest getInstance() {
//		return stt;
//	}

	public static SingleTonTest getInstance() {
		if (stt == null) {
			stt = new SingleTonTest();
		}
		return stt;
	}
}
