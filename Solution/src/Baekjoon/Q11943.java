package Baekjoon;

import java.util.Scanner;

public class Q11943 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt(), B = sc.nextInt();
		int C = sc.nextInt(), D = sc.nextInt();
		
		System.out.println((A + D) < (B + C) ? A+D : B+C);
	}
}
