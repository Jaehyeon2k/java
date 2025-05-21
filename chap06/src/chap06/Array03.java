package chap06;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		double[][] marks = new double[2][3];
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < marks.length; i++) {
			System.out.println("학생번호" + (i + 1 ));
			System.out.print("국어점수 : ");
			marks[i][0] = s.nextDouble();
			
			System.out.print("수학점수 : ");
			marks[i][1] = s.nextDouble();
			
			marks[i][2] = (marks[i][0] + marks[i][1]) / 2;
			
		}
		for (int i = 0; i < marks.length; i++) {
			System.out.println("학생번호" + (i + 1));
			System.out.printf("국어 : %.1f ", marks[i][0]);
			System.out.printf("수학 : %.1f ", marks[i][1]);
			System.out.printf("평균 : %.1f \n", marks[i][2]);
		}
	}

}
