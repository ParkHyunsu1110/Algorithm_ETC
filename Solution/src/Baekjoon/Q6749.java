package Baekjoon;

import java.util.Scanner;

public class Q6749 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int latest = sc.nextInt();
		int second = sc.nextInt();
		
		System.out.println((second + (second - latest)));
	}
}
