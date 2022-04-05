package Baekjoon;

import java.util.Scanner;

public class Q16204 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), m = sc.nextInt(), k = sc.nextInt();
		int count=0;
		int[] mArr = new int[n];
		int[] kArr = new int[n];
		for(int i=0; i<n; i++) mArr[i] = kArr[i] = 0;
		for(int i=0; i<m; i++) mArr[i] = 1;
		for(int i=0; i<k; i++) kArr[i] = 1;
		
		for(int i=0; i<n; i++) {
			if(mArr[i] == kArr[i]) count++;
		}
		System.out.println(count);
	}
}
