package Baekjoon;

import java.util.Scanner;

public class Q14924 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int S = sc.nextInt(), T = sc.nextInt(), D = sc.nextInt();
		int F = (D / (S * 2)) * T;
		System.out.println(F);
	}
}
