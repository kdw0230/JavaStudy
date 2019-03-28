package com.kopo.human;

public class TestMain {
	public static void main(String[] args) {
		Radio ra = new Radio();
		TV tv = new TV();
		MP3 mp3 = new MP3();
		ra.volumeUp();
		ra.volumeDown();
		tv.volumeUp();
		tv.volumeDown();
		mp3.volumeUp();
		mp3.volumeDown();
		
		
	}
}
