package Baekjoon;

import java.util.Scanner;

public class Q2475 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		int[] arr = new int[5];
		for(int i=0; i<5; i++) {
			int num = sc.nextInt();
			arr[i] = num * num;
			sum += arr[i];
		}

		System.out.println(sum % 10);
	}
}
