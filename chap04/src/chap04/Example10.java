package chap04;

public class Example10 {

	public static void main(String[] args) {
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단");
			for (int j = 1; j < 10; j++) {
				System.out.printf("%d x %d = %d\n", i, j, i * j);
			}
			System.out.println("");
		}

	}

}
