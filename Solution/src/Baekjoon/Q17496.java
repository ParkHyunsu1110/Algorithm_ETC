package Baekjoon;

import java.util.Scanner;

public class Q17496 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //총 기간
		int T = sc.nextInt(); //자라는 기간
		int C = sc.nextInt(); //칸 수
		int p = sc.nextInt(); //개당 가격
		
		
		if((N / T) * T + 1 > N) System.out.println(((N / T) - 1) * C * p);
		else System.out.println((N / T) * C * p);
	}
}
