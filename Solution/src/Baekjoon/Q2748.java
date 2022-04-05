package Baekjoon;

import java.util.Scanner;
public class Q2748 {
	static long[] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		
		arr = new long[N + 1];
		
		for(int i=0; i<arr.length; i++) arr[i] = -1;
		
		arr[0] = 0;
		arr[1] = 1;
		
		System.out.println(Fibo(N));
	}
	public static long Fibo(int N) {
		if(arr[N] == -1) arr[N] = Fibo(N - 1) + Fibo(N - 2);
		return arr[N];
	}
}
