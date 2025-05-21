
public class test5 {

	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				if (i == 10 / 2 || (j == 10 / 2 || i == j || j + i == 10) 
						&& i > 10 / 2) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
