package Baekjoon;

import java.util.Scanner;
public class Q2480 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int price=0;
		
		if(a == b && b == c) price = 10000 + a*1000;
		else if(a == b || a == c) price = 1000 + a*100;
		else if(b == c) price = 1000 + b*100;
		else {
			price = Max(a, b, c) * 100;
		}
		System.out.println(price);
	}
	public static int Max(int a, int b, int c) {
		return (a > b) ? ((a > c) ? a : c ):((b > c) ? b : c); 
	}
}
