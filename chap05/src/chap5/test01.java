package chap5;

public class test01 {
	public static void divide(int x, int y) {
		System.out.println(x / y);
	}
	public static void divide(double x, int y) {
		System.out.println(x / y);
	}
	public static void divide(int x, double y) {
		System.out.println(x / y);
	}
	public static void divide(double x, double y) {
		System.out.printf("%.2f\n" ,x / y);
	}
	public static void main(String[] args) {
		divide(1.5, 2.6);
		divide(5, 3.2);
		divide(3.0 , 5);

	}

}
