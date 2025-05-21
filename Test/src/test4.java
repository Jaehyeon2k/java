import java.util.Iterator;
import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
//		다이아몬드 모양을 출력하세요.
		Scanner scn = new Scanner(System.in);

		int n = scn.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i * 2 - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n * 2 - (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
	}
}
