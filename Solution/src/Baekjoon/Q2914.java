package Baekjoon;

import java.util.Scanner;
public class Q2914 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
		int melody = sc.nextInt() * (sc.nextInt() - 1) + 1;	
		System.out.println(melody);
	}
}
