package chap5;

public class Method03 {
	public static int max(int x, int y) {
		int result;
		if (x > y) result = x;
		else result = y;
		return result;
	}
	public static void main(String[] args) {
		int a = 5, b = 6;
		int num = max(a,b);
		System.out.printf("%d와 %d의 수 중 %d이 큽니다", a, b, num);

	}

}
