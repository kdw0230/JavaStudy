package com.kopo.human2;

public class TestMain {
//	public void human() {
//
//	}
//	public void human(int a) {
//
//	}
//	public void human(float a) {
//
//	}
//	public void human(int a, int b) {
//
//	}
//	public void human(int a, float b) {
//
//	}
//	public void human(float a, int b) {
//
//	}
	public static void main(String[] args) {
//		Radio ra = new Radio();
//		Radio ra1 = new Radio();
//		Radio ra2 = ra1;
//		System.out.println(ra);
//		System.out.println(ra1);
//		System.out.println(ra2);
//		Tv tv = new Tv();
//		Mp3 mp3 = new Mp3();
//		ra.volumeUp();
//		ra.volumeDown();
//		tv.volumeUp();
//		tv.volumeDown();
//		mp3.volumeUp();
//		mp3.volumeDown();
		
		Elec audio = new Elec() {

			@Override
			public void volumeUp() {
				System.out.println("오디오 볼륨업");
			}

			@Override
			public void volumeDown() {
				System.out.println("오디오 볼륨 다운");
			}
			
		};
		audio.volumeUp();
		audio.volumeDown();

	}
}
