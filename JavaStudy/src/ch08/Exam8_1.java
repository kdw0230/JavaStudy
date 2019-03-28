package ch08;


public class Exam8_1 {
	public static void main(String[] args) {
		Triangle t1 = new Triangle();
		t1.setBottom(100.0f);
		t1.setHeight(200.0f);
		float tArea1 = t1.getArea();
		System.out.println(tArea1);
		
		Triangle t2 = new Triangle(25.5f, 50.5f);
		float tArea2 = t2.getArea();
		System.out.println(tArea2);
	}
}
