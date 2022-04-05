package Baekjoon;

import java.util.*;
public class Q4153 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int a = sc.nextInt(); int b = sc.nextInt(); int c = sc.nextInt();
			if(a + b + c == 0) return;
			if(a*a + b*b == c*c || b*b == c*c + a*a || a*a == b*b + c*c)
				System.out.println("right");
			else System.out.println("wrong");
		}
	}
}
