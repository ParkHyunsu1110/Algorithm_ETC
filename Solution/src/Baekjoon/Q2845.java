package Baekjoon;

import java.util.Scanner;

public class Q2845 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int person = sc.nextInt(), m2 = sc.nextInt();
		int[] news = new int[5];
		
		for(int i=0; i<news.length; i++) news[i] = sc.nextInt() - (person * m2);
		for(int i : news) System.out.print(i + " ");
	}
}
