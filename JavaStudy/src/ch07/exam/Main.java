package ch07.exam;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/* 헌혈자 정보 */
		Scanner s = new Scanner(System.in);

		System.out.print("이름을 입력하시오. >>");
		String a = s.next();

		System.out.print("나이를 입력하시오. >>");
		int b = s.nextInt();

				
		System.out.print("혈액형을 입력하시오. >>");
		String c = "";
		while (true) {
			try {
				c = s.next();
				String type = c.intern();
				if (type == "a" || type == "A" || type == "b" || type == "B" || type == "o" || type == "O"
						|| type == "ab" || type == "AB") {
					break;
				} else {
					throw new Exception();
				}
			} catch (Exception e) {
				System.out.print("잘못된 값입니다. 다시 입력해주세요. >>");

			}
		}
		while (true) {
			c = s.next();
			String type = c.intern();
			if (type == "a" || type == "A" || type == "b" || type == "B" || type == "o" || type == "O" || type == "ab"
					|| type == "AB") {
				break;
			} else {
			System.out.print("잘못된 값입니다. 다시 입력해주세요. >>");
			}

		}
//		Test test = new Test();

		Human human = new Human();
		human.setName(a);
		human.setAge(b);
		human.setType(c);

		/* BloodHouse 객체 생성 */
		BloodHouse bh = new BloodHouse();

		String result = bh.action(human); // action() 메소드 호출 결과 저장
		// String result = "";
		// result = bh.action(human);

		/* action() 메소드를 호출하면서 매개변수로 헌혈자 정보 넘겨줌 */
		/* action() 메소드 호출 결과 출력 */
		System.out.println(result);
	}
}