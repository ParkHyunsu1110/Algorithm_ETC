package Baekjoon;

import java.util.Scanner;

public class Q11549 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int correct = 0;
		for(int i=0; i<5; i++) {
			if(a == sc.nextInt()) correct++;
		}
		System.out.println(correct);
	}
}
