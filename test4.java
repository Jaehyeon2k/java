package task;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n - 1 || i + j == n - 1 && j < n / 2 || i == j && j < n / 2 ) {
					System.out.print("*");
				}else if (n % 2 != 0 && (n / 2) == i && n / 2 == j){
					System.out.print("*");
				}else
					System.out.print(" ");
				
			}
			System.out.println();
		}
	}
}