package first;

public class exam24 {

	public static void main(String[] args) {
		final int LIMIT = 12;
		final int CNT = 4;
		int sum = 0;

		for (int i = CNT; i <= LIMIT; i += CNT) {
			sum += i;
			System.out.print("(");
			for (int j = 1; j <= i / CNT; j++) {
				System.out.print(CNT);
				if (j < i / CNT) {
					System.out.print("+");
				}
			}
			System.out.print(")");

			if (i < LIMIT) {
				System.out.print("+");
			}
		}

		System.out.print("=" + sum); // or 수식 계산
	}

}
