package ch12;

public class IndexOf {
	public static void main(String[] args) {
		// 0123456789
		String text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.";
		// System.out.println(text.length());

		int index = -1; // ù ���ڰ� 0���� ����
		while (true) {
			index = text.indexOf("L", index + 1);
			if (index == -1) {
				break;
			}
			System.out.println(index);
		}

	}
}
