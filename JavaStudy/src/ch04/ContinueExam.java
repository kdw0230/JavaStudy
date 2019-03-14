package ch04;

import java.io.File;

public class ContinueExam {
	public static void main(String[] args) {
		File file = new File("C:\\Windows\\System32\\drivers\\etc");
		File[] files = file.listFiles();
		for(int i = 0; i <file.length();i++) {
			long fileSize = files[i].length();
			if (fileSize < 1000) {
				//파일 크기가 1000Byte미만이면 아래코드 무시
				continue;
			}
			System.out.println(files[i].getName() + "/" + fileSize);
		}
	}
}
