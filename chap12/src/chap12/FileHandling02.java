package chap12;

import java.io.*;

public class FileHandling02 {

	public static void main(String[] args) {
		File file = new File("gugudan.txt");
		try {
			if(!file.exists())
				file.createNewFile();
			
			FileOutputStream fos = new FileOutputStream(file);
			
			for (int x = 1; x <= 9; x++) {
				for (int y = 2; y <= 9; y++) {
					String str = y + " X " + x + "=" + (x * y) + " \t";
					byte[] b = str.getBytes();
					fos.write(b);
				}
				String n = "\n";
				byte[] b = n.getBytes();
				fos.write(b);
			}
			fos.close();
			System.out.println("파일 쓰기 성공");
		} catch (Exception e) {
			e.getMessage();
		}

	}

}
