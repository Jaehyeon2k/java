package chap12;

import java.io.*;

public class Example05 {

	public static void main(String[] args) {
		try {
			File file = new File("example03.txt");
			if (!file.exists()) {
				file.createNewFile();
			}
			// FileReader는 문자를 읽음 (텍스트파일)
			FileReader fis = new FileReader(file);
			int i = 0;
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}
			fis.close();
			System.out.println("\n파일 읽기 성공");

		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
