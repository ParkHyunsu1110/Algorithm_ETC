package Baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class Q2338 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger(); BigInteger b = sc.nextBigInteger();
		System.out.println(a.add(b) + "\n" + a.subtract(b) + "\n" + a.multiply(b));
	}
}
