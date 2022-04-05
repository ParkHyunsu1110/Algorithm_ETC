package Baekjoon;

import java.util.Scanner;

public class Q10707 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A=sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		int D=sc.nextInt();
		int P=sc.nextInt();

		System.out.println((useX(A, P) < useY(B, C, D, P)) ? useX(A, P) : useY(B, C, D, P));
	}
	public static int useX(int A, int P) {
		return A * P;
	}
	public static int useY(int B, int C, int D, int P) {
		if(C < P) {
			return B + (P - C)*D;
		} else return B;
	}
}
