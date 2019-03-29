package com.kopo.human2;

public class Receive {
	public int receive(int send) {
		System.out.println("receive = "+send);
		send = send + 7;
		return send;
	}
}
