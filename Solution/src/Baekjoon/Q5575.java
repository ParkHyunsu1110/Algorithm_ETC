package Baekjoon;

import java.util.Scanner;

public class Q5575 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			int hG = sc.nextInt(), mG = sc.nextInt(), sG = sc.nextInt();
			int hL = sc.nextInt(), mL = sc.nextInt(), sL = sc.nextInt();
			int h = hL - hG, m = mL - mG, s = sL - sG;
			
			if(s < 0) {
				s += 60;
				m--;
			}
			if(m < 0) {
				m += 60;
				h--;
			}
			
			System.out.println(h + " " + m + " " + s);
		}
	}
}
