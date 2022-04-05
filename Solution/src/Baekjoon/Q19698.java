package Baekjoon;

import java.util.Scanner;

public class Q19698 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), W = sc.nextInt(), H = sc.nextInt(), L = sc.nextInt();
		
		int poss = (W/L) * (H/L);
		if(N > poss) System.out.println(poss);
		else System.out.println(N);

	}
}
