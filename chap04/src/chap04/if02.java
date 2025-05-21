package chap04;

import java.util.Scanner;

public class if02 {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요.");

		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();

		if (num % 2 == 0) {
			System.out.println(num + "은 짝수");
		} else {
			System.out.println(num + "은 홀수");
		}

		System.out.println("이 문장은 if문 외부에 있습니다.");
	}

}
