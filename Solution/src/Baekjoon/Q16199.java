package Baekjoon;

import java.util.Scanner;

public class Q16199 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int y1=sc.nextInt(), m1 = sc.nextInt(), d1 = sc.nextInt();
		int y2=sc.nextInt(), m2 = sc.nextInt(), d2 = sc.nextInt();
		
		int age1 = y2 - y1;
		int age2 = y2 - y1 + 1;
		int age3 = y2 - y1;

		if((m2 - m1) < 0) age1--; 
		else if((m2 - m1) == 0) {
			if((d2 - d1) < 0) age1--;
		}
		System.out.println(age1);
		System.out.println(age2);
		System.out.println(age3);
	}
}
