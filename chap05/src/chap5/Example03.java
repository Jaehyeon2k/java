package chap5;

public class Example03 {
	public static int add(int x, int y) {
		return x + y;
	}
	public static void main(String[] args) {
		int a = 5, b = 6;
		int sum = add(a,b);
		System.out.printf("%d와 %d의 합은 %d입니다.\n", a, b, sum);
		
		System.out.println(add(a,b));
		

	}

}
