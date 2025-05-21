import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
// 		3 이상인 정수를 입력 받으면  X를 출력하는 코드를 작성하세요.
		

		System.out.println("3이상 이며, 홀수인 정수를 입력하세요.");

		Scanner scn = new Scanner(System.in);

		int height = 1;
		while (true) {
			height = scn.nextInt();
			if (height % 2 == 0 || height < 3) {
				System.out.println("다시 입력하세요.");
			} else {
				for (int i = 0; i < height; i++) {
					for (int j = 0; j < height; j++) {
						if (i == j || j + i + 1 == height) {
							System.out.print("*");
						} else
							System.out.print(" ");
					}
					System.out.println();
				}
				break;
			}
		}
	}
}
