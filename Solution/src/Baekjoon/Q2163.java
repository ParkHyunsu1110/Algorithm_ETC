package Baekjoon;

import java.util.Scanner;

public class Q2163 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), m = sc.nextInt();
		int times = (n-1) + (m-1)*n;
		System.out.println(times);
	}
}
