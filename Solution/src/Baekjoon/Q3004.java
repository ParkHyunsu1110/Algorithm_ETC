package Baekjoon;

import java.util.Scanner;

public class Q3004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int result = 0;
		if(N % 2 == 0)  result = (int) Math.pow(((N/2) + 1), 2);
		else  result = ((N + 1)/2) * (((N + 1)/2) + 1);
		System.out.println(result);
	}
}
