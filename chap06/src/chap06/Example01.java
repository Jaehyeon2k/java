package chap06;

public class Example01 {

	public static void main(String[] args) {
		int [] myArr = new int[5];
		for (int i = 0; i < myArr.length; i++) {
			myArr[i] = (i * 1) * 10;
			System.out.printf("%d번째 요소값 : %d\n", i , myArr[i]);
		}

	}

}
