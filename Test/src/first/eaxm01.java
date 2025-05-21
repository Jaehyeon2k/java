package first;

public class eaxm01 {

	public static void main(String[] args) {
		int arr[] = { 0, 0, 1, 0, 0,
					  0, 1, 0, 1, 0,
					  1, 0, 2, 0, 1,
					  0, 1, 0, 1, 0,
					  0, 0, 1, 0, 0 };
		for (int i = 0; i < arr.length; i++) {
			if (i % 5 == 0 && i != 0)
				System.out.println();
			if (arr[i] == 0)
				System.out.print(" ");
			else
				System.out.print("*");
		}
		System.out.println();
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if(i < j || i + j < 10 - 1)
				System.out.print("*");
				else
					System.out.print(" ");
			}
//			for (int j = 0; j < 10 - (i * 2); j++) {
//				System.out.print("*");
//			}
			System.out.println();
		}
	}
}
