package Baekjoon;

import java.util.Scanner;

public class Q3003 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] piece = {1, 1, 2, 2, 2, 8};
		int[] collect = new int[6];
		
		for(int i=0; i<piece.length; i++) collect[i] = piece[i] - sc.nextInt();
		for(int i : collect) System.out.print(i + " ");
	}
}
