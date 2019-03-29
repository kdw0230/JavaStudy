package com.kopo.human3;

import java.util.ArrayList;

import com.kopo.human.Elec;
import com.kopo.human.Mp3;
import com.kopo.human.Radio;
import com.kopo.human.Tv;

public class CollectionTest {
	public void testArrayList() {
		//jdk 1.6까지의 사용법
		ArrayList<Elec> al = new ArrayList<Elec>();
		//jdk 1.7부터의 사용법
//		ArrayList<Elec> al = new ArrayList<>();
		al.add(new Mp3());
		al.add(new Radio());
		al.add(new Tv());
		for(Elec temp : al ) {
			temp.volumeUp();
			temp.volumeDown();
		}
	}

	public static void main(String[] args) {
		CollectionTest colt = new CollectionTest();
		colt.testArrayList();
//		colt.testHashMapList();
		
	}

}
