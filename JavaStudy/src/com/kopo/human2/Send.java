package com.kopo.human2;

public class Send {
	int send;

	public Send(int send) {
		this.send = send;
		System.out.println("send = " + send);
	}

	public void send() {
		Receive re = new Receive();
		int result = re.receive(send);
		System.out.println("result = " + result);
	}

//	public void sendObject(Elec elec) {
//		elec.volumeUp();
//		elec.volumeDown();
//	}
	public void sendObject(Mp3 a) {
		a.i = 28;
	}
}
