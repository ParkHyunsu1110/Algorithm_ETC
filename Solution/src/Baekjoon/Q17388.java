package Baekjoon;

import java.util.Scanner;

public class Q17388 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int S = sc.nextInt(), K = sc.nextInt(), H = sc.nextInt();
		
		if(S + K + H > 99) System.out.println("OK");
		else System.out.println( (S > K) ? (K > H) ? "Hanyang" : "Korea" : (S > H) ? "Hanyang" : "Soongsil");
	}
}
