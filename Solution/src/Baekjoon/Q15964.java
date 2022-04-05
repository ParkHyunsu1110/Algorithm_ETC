package Baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class Q15964 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println(sc.nextBigInteger().pow(2).subtract(sc.nextBigInteger().pow(2)));
	}
}
