package Baekjoon;

import java.util.Scanner;

public class Q1297 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int D = sc.nextInt();
		int rateH = sc.nextInt(), rateW = sc.nextInt();
		
		double rate = Math.pow(D, 2) / (Math.pow(rateH, 2) + Math.pow(rateW, 2));
		
		System.out.println((int) Math.sqrt(rate * Math.pow(rateH, 2)) + " " + (int) Math.sqrt(rate * Math.pow(rateW, 2)));
	}
}
