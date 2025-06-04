package chap12;

import java.io.*;

public class Example04 {

	public static void main(String[] args) {
		try {
			File file = new File("example03.txt");
			if(!file.exists())
				file.createNewFile();
			// FileInputStream은 byte(이미지,영상)을 읽음
			FileInputStream fis = new FileInputStream(file); 
			int i = 0;
			
			while((i=fis.read()) != -1) {
//				System.out.println(fis.read());
				System.out.print((char)i);
			}
			fis.close();
			System.out.println("\n파일 읽기 성공");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
