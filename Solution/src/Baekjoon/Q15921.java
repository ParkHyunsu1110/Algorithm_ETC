package Baekjoon;

import java.util.Scanner;

public class Q15921 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] array = new int[N];
		double Px = 0, sum=0;
		
		if(N == 0) {
			System.out.println("divide by zero");
			return;
		}
		
		for(int i=0; i<array.length; i++) {
			array[i] = sc.nextInt();
			sum += array[i];
		}
		
		double ever = sum / N;
		
		for(int i=0; i<N; i++) Px += array[i] * (1.0 / N);
		
		if(Px == 0) {
			System.out.println("divide by zero");
			return;
		}
		
		System.out.printf("%.2f", ever / Px);
	}
}
