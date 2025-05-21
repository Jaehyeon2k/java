package chap04;

import java.util.Scanner;

public class Loop04 {

	public static void main(String[] args) {
		System.out.print("길이 :");
		Scanner scn = new Scanner(System.in);

		int len = scn.nextInt();
//		
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < (2 * len) - 1 - (i * 2); j++) {
				System.out.print("*");
			}
			System.out.println("");
			}
//		
//		}
		for (int i = 10; i > 0; i--) {
				for (int j = 0; j < i / 2; j++) {
						System.out.print(" ");
				}
				for (int j = 10; j > i ; j--) {
					if (i % 2 != 0)
					System.out.print("*");
				}
			System.out.println("");
		}

//		System.out.println("------------------------");

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len; j++) {
				if (i == 0 || i == len - 1) {
					System.out.print("*");
				} else if (j == 0 || j == len - 1) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

//		System.out.println("------------------------");

//		for (int i = 0; i < len; i++) {
//			if (i == 0 || i == len - 1) {
//				for (int j = 0; j < len; j++) {
//					System.out.print("*");
//				}
//			} else {
//				for (int k = 0; k < len; k++) {
//					if (k == 0 || k == len - 1) {
//						System.out.print("*");
//					} else {
//						System.out.print(" ");
//					}
//				}
//			}
//			System.out.println();
//		}

//		System.out.println("-----------------");

//		for (int i = 0; i < len; i++) {
//			if (i == 0 || i == len - 1) {
//				for (int j = 0; j < len; j++) {
//					System.out.print("*");
//				}
//			} else {
//				for (int k = 0; k < len; k++) {
//					if (k == 0 || k == len - 1 || k == i) {
//						System.out.print("*");
//					} else {
//						System.out.print(" ");
//					}
//				}
//			}
//			System.out.println();
//		}
		}
	}
