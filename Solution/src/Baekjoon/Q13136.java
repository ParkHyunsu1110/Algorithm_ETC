package Baekjoon;

import java.util.Scanner;

public class Q13136 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long r = sc.nextLong(), c = sc.nextLong(), n = sc.nextLong();
		long width = 0, height = 0;
		
		if(r % n > 0) width += r/n + 1;
		else width += r/n;
		
		if(c % n > 0) height += c/n + 1;
		else height += c/n;

		System.out.println(width * height);
	}
}
