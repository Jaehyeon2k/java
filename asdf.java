package task;

import java.util.Iterator;
import java.util.Scanner;

public class asdf {

	public static void main(String[] args) {
		System.out.println("3 이상 홀수 값을 입력하세요.");
		Scanner scn = new Scanner(System.in);

		while (true) {
			int n = scn.nextInt();

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (i == n / 2 || j == n / 2) {
						System.out.print("*");
					} else
						System.out.print(" ");
				}
				System.out.println();
			}
		}
	}
}