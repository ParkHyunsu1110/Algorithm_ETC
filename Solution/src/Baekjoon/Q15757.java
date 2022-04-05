package Baekjoon;

import java.util.Scanner;

public class Q15757 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		int count = T / 5;
		if(T % 5 != 0) count++;
		System.out.println(count);
	}
}
