package chap04;

import java.util.Scanner;

public class Loop02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int choice = 1;
		
		while (choice == 1) {
			
			System.out.println("숫자를 입력하세요.");
			int a = s.nextInt();
			
			if(a % 2 == 0) {
				System.out.println("짝수 입니다.");
			}	else {
				System.out.println("홀수 입니다.");
			}
			
			System.out.println("계속 하고싶으면 1, 그만하고 싶으면 0을 입력하세요.");
			
			choice = s.nextInt();
			
		}
		System.out.println("모든 숫자를 확인했습니다.");

	}

}
