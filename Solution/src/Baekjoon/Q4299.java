package Baekjoon;

import java.util.Scanner;

public class Q4299 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = sc.nextInt(), sub = sc.nextInt();
		if(sum < sub)
			System.out.println("-1");
		else {
			int win = (sum + sub) / 2;
			int lose = (sum - sub) / 2;
			
			if(win + lose == sum && win - lose == sub) System.out.println(win + " " + lose);
			else System.out.println("-1");
		}	
	}
}
