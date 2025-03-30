package task;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) {
//		삼각형의 테두리만 구현하세요.
		
		System.out.println("삼각형의 크기 입력하세요.");
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		for (int i = 1; i <= n; i++) { // 삼각형의 높이 ( 총 몇번 반복할것 인지
			for (int j = 1; j <= n - i; j++) {// 가로 공백 출력
				System.out.print(" ");
			}
			for (int k = 1; k <= i * 2 - 1; k++) { // 별을 언제 몇개 출력할 것인지
				if (k == 1 || i == n || k == (2 * i - 1))
					System.out.print("*");
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
