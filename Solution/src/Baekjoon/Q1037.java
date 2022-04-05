package Baekjoon;

import java.util.*;

public class Q1037 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();

		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i=0; i<a; i++) arr.add(sc.nextInt());

		Collections.sort(arr);
		System.out.println(arr.get(0) * arr.get(arr.size() - 1));
	}
}
