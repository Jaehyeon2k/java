import java.util.Scanner;

public class test1 {

	public static void main(String[] args) {
//		정삼각형의 테두리와 높이를 구현하세요.
		
		System.out.println("삼각형의 높이를 입력하세오");
		Scanner scn = new Scanner(System.in);

		int height = scn.nextInt();

		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= height - i; j++) {
				System.out.print(" ");
			}
			
			for (int k = 1; k <= i * 2 - 1; k++) {
				if (k == 1 || i == height || k == (2 * i - 1) || k == i)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			
			System.out.println();
		}
	}
}