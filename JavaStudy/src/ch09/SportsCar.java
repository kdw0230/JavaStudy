package ch09;

public class SportsCar extends Car {
	char color = 'R';
	
	String s;
	
	@Override // ����
	void move() {
		System.out.println("������ī �̵� �ü� 300km");
	}

	SportsCar() {
		System.out.println("SportsCar ��ü ����");
	}

	void openSunloof() {
		System.out.println("����� ����");
	}
}

// class InheritanceExam1 {
//	public static void main(String[] args) {
//		SportsCar sc = new SportsCar();
//		sc.move();
//		sc.openSunloof();
//		System.out.println(sc.getDoor());
//		System.out.println(sc.getTire());
//		System.out.println(sc.toString());
//	}
//}