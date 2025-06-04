package chap12;

import java.io.*;

public class Example03 {

	public static void main(String[] args) {
		try {
			File file = new File("example03.txt");
			if (!file.exists()) {
				file.createNewFile();
			}	
			FileWriter fw = new FileWriter(file);
			
			fw.write("Hello!!\n");
			fw.write("Java Programming");
			fw.close();
			System.out.println("파일 쓰기 성공");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
