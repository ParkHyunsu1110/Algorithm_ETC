package Baekjoon;

import java.util.Scanner;

public class Q14935 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		System.out.println(digit(X));
	}
	public static int digit(int x) {
		int count = 0;
		while(x / 10 == 0) {
			count++;
		}
		return count;
	}
}
