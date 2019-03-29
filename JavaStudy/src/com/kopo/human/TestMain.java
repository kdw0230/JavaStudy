package com.kopo.human;

public class TestMain {
	public void human() {

	}
	public void human(int a) {

	}
	public void human(float a) {

	}
	public void human(int a, int b) {

	}
	public void human(int a, float b) {

	}
	public void human(float a, int b) {

	}
	public static void main(String[] args) {
		Radio ra = new Radio();
		Radio ra1 = new Radio();
		Radio ra2 = ra1;
		System.out.println(ra);
		System.out.println(ra1);
		System.out.println(ra2);
		System.out.println(6);
//		TV tv = new TV();
//		MP3 mp3 = new MP3();
//		ra.volumeUp();
//		ra.volumeDown();
//		tv.volumeUp();
//		tv.volumeDown();
//		mp3.volumeUp();
//		mp3.volumeDown();

	}
}
