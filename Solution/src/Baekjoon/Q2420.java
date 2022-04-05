package Baekjoon;

import java.util.Scanner;

public class Q2420 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Long N=sc.nextLong() - sc.nextLong();
		if(N < 0) N *= -1;
		System.out.println(N);
	}
}
