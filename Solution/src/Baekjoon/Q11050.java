package Baekjoon;

import java.util.Scanner;
public class Q11050 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int up = 1, down1 = 1, down2 = 1;
		for(int i = 1; i <= N; i++) up *= i;
		for(int i = 1; i <= K; i++) down1 *= i;
		for(int i = 1; i <= N - K; i++) down2 *= i;
		int result = up / (down1 * down2);
		System.out.println(result);
	}
}
