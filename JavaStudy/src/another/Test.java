package another;

import ch07.Notebook;

public class Test {
	public static void main(String[] args) {
		Notebook nb1 = new Notebook();//다른 package에 있을때 import
//		nb1.price = 100; //다른 package에 있는 변수 가져다가 쓸수없음
		nb1.setPrice(100); // 옳바른 표현
		nb1.setBrand("abcd");
		nb1.setSize(15);
		nb1.print();
	}
}
