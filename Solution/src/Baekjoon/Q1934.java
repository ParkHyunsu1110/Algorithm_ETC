package Baekjoon;

import java.util.Scanner;

public class Q1934 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			int a = sc.nextInt(), b = sc.nextInt();
			
			System.out.println((a * b) / GCD(a, b));
		}
	}
	public static int GCD(int a, int b) {
		if(b == 0) return a;
		int temp=0;
		temp = a;
		a = b;
		b = temp % b;
		return GCD(a, b);
	}
}
