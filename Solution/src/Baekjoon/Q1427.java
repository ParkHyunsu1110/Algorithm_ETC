package Baekjoon;

import java.util.*;
public class Q1427 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String N = String.valueOf(n);
		
		String[] arr = N.split("");
		String result = "";
		Arrays.sort(arr, Comparator.reverseOrder());
		
		for(int i = 0; i<arr.length; i++) result += arr[i]; 
		System.out.println(result);
	}
}
