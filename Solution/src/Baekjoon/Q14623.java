package Baekjoon;

import java.util.Scanner;

public class Q14623 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String b1 = sc.next(), b2 = sc.next();
		
		long b1b1 = Long.parseLong(b1, 2);
		long b2b2 = Long.parseLong(b2, 2);
		
		b1b1 *= b2b2;
		System.out.println(Long.toBinaryString(b1b1));

	}
}
