package chap06;

import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		String[] arr;
		arr = new String[3];

		Scanner s = new Scanner(System.in);

		System.out.println("3개 문자열을 입력하세요.");

		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextLine();
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
