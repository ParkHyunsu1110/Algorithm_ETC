package Baekjoon;

import java.util.Scanner;

public class Q2530 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(), m = sc.nextInt(), s = sc.nextInt();
		int totalSec = sc.nextInt();

		//전체 초를 초와 분으로 나눠서 넣어줌
		s += totalSec;
		m += s / 60;
		s %= 60;
		
		h += m / 60;
		m %= 60;
		
		h %= 24;
		
		System.out.println(h + " " + m + " " + s);
	}

}
