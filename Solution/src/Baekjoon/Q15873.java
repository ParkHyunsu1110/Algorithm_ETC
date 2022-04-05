package Baekjoon;

import java.util.Scanner;

public class Q15873 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int first = 0,second = 0;
		
		if(N % 10 == 0) {
			first = N / 100;
			second = N % 100;
		} else {
			first = N / 10;
			second = N % 10;
		}
		
		System.out.println((first + second));
	}
}
