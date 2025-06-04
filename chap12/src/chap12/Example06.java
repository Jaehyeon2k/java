package chap12;

import java.io.*;

public class Example06 {

	public static void main(String[] args) {
		try {
			File file = new File("example03.txt");
			if (!file.exists())
				file.createNewFile();
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String str;
			while((str = br.readLine()) != null) {
				System.out.println(str);
			}
			fr.close();
			System.out.println("파일 읽기 성공");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
