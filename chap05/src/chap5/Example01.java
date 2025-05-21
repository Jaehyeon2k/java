package chap5;

import java.util.Scanner;

public class Example01 {
	public static void Method(int num) {
		if (num % 2 == 0) {
			System.out.println("짝수입니다");
		} else {
			System.out.println("홀수입니다.");
		}
	}

	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		
		num = s.nextInt();
		Method(num);
		
		num = s.nextInt();
		Method(num);
		
		num = s.nextInt();
		Method(num);
	}

}
