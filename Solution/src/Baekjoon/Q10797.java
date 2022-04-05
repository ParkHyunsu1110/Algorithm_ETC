package Baekjoon;

import java.util.Scanner;

public class Q10797 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ten = sc.nextInt();
		int count=0;
		for(int i=0; i<5; i++) {
			if(sc.nextInt() == ten) count++; 
		}
		System.out.println(count);
	}
}
