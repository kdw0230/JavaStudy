package com.kopo.human;

public class TV implements Elec {

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("티비 볼륨 업");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("티비 볼륨 다운");
	}

}
