package Baekjoon;

import java.util.Scanner;
public class Q2525 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		B += C;
		while(B >= 60) {
			if(B >= 60) {
				B -= 60;
				A++;
			}
			if(A >= 24) A -= 24;
		}
		System.out.println(A + " " + B);
	}
}
