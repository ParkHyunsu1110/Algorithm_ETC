package Baekjoon;

import java.util.*;

public class Q2752 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		for(int i=0; i<3; i++) array.add(sc.nextInt());
		Collections.sort(array);

		for(int i : array) System.out.print(i + " ");
	}
}
