package Baekjoon;

import java.io.*;
import java.math.BigInteger;

public class Q14928 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BigInteger N = new BigInteger(bf.readLine());
		BigInteger S = new BigInteger("20000303");
		System.out.println(N.remainder(S));
	}
}
