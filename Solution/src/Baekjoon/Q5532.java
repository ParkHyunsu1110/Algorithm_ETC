package Baekjoon;

import java.util.Scanner;

public class Q5532 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int L=sc.nextInt();
		int A=sc.nextInt(); int B=sc.nextInt();
		int C=sc.nextInt(); int D=sc.nextInt();
		int ko = A / C;
		int en = B / D;
		
		if(A % C != 0) ko++;
		if(B % D != 0) en++;
		
		System.out.println((ko > en) ? (L - ko) : (L - en) );
	}
}
