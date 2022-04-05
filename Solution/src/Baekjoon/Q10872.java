package Baekjoon;

import java.util.*;
public class Q10872 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(Factorial(N));
	}
	public static int Factorial(int N) {
		if(N <= 1) return 1; 
		return N * Factorial(N-1);
	}
}
