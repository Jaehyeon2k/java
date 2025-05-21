package chap04;

import java.util.Scanner;

public class If04 {

	public static void main(String[] args) {
		System.out.println("3개의 숫자를 입력하세요.");
		
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		int y = scn.nextInt();
		int z = scn.nextInt();
		
		if(x > y) {
			if (x > z) {
				System.out.println(x + "는 가장 큰 수");
			} else {
				System.out.println(x + "가장 큰 수가 아님");
			}
		} else {
			System.out.println(x + "가장 큰수가 아님.");
		}

	}

}
