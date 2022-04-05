package Baekjoon;

import java.util.Scanner;

public class Q2609 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(GCD(a, b));
		System.out.println(a * b / GCD(a, b));
	}
	public static int GCD(int a, int b) {
		while(b != 0) {
			int r = a % b; //³ª¸ÓÁö
			a=b; b=r;
		}
		return a;
	}
}
