package another;

import ch07.Notebook;

public class Test {
	public static void main(String[] args) {
		Notebook nb1 = new Notebook();//�ٸ� package�� ������ import
//		nb1.price = 100; //�ٸ� package�� �ִ� ���� �����ٰ� ��������
		nb1.setPrice(100); // �ǹٸ� ǥ��
		nb1.setBrand("abcd");
		nb1.setSize(15);
		nb1.print();
	}
}
