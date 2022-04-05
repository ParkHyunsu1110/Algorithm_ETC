package Baekjoon;

import java.util.Scanner;

public class Q23825 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int S = sc.nextInt(), N = sc.nextInt();
		
		int a = S < N ? S : N;
		
		System.out.println(a / 2);

	}
}
