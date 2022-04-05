package Baekjoon;

import java.util.Scanner;

public class Q2747 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(Fibo(sc.nextInt()));
	}
	public static int Fibo(int n) {
		int f1 = 0;
		int f2 = 1;
		int f3 = 1;
		
		for(int i = 2; i<=n; i++) {
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
		}
		
		return f3;
	}
}
