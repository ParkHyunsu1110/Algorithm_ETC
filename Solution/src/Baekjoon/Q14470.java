package Baekjoon;

import java.util.Scanner;

public class Q14470 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt(), B = sc.nextInt();
		int C = sc.nextInt(), D = sc.nextInt(), E = sc.nextInt();
		int total=0;
		
		if(A <= 0) {
			total += A*(-1)*C;
			total += D;
			total += B*E;
		}
		else total += (B-A)*E;
		
		System.out.println(total);
	}
}
