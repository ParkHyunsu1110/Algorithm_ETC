package Baekjoon;

import java.util.Scanner;

public class Q17362 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt(), finger=0;
		
		switch(N % 8) {
		case 1: finger=1; break;
		case 2: case 0: finger=2; break;
		case 3: case 7: finger=3; break;
		case 4: case 6: finger=4; break;
		case 5: finger=5; break;
		}
		System.out.println(finger);
	}
}
