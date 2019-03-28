package com.kopo.human;

public class Radio implements Elec {
//alt + shift + S = source창
	
	@Override
	public void volumeUp() {
		System.out.println("라디오 볼륨 업");
	}

	@Override
	public void volumeDown() {
		System.out.println("라디오 볼륨 다운");
	}
	
	
}
