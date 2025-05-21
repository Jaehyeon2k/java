package chap06;

public class Example03 {

	public static void main(String[] args) {
		int [][] arr = new int[2][4];
		arr[0][0] = 2;
		arr[0][1] = 5;
		arr[0][2] = 7;
		arr[0][3] = 4;
		arr[1][0] = 9;
		arr[1][1] = 3;
		arr[1][2] = 2;
		arr[1][3] = 8;
		
		int sum1 = 0, sum2= 0;
		for (int i = 0; i < 4; i++) {
			sum1 += arr[0][i];
		}
		System.out.println("첫 번째 행의 합계: " + sum1);
		for (int i = 0; i < 4; i++) {
			sum2 += arr[1][i];
		}
		System.out.println("두 번쨰 행의 합계: " + sum2);
		
	}

}
