package Baekjoon;

import java.util.*;
public class Q10039 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		for(int i=0; i<5; i++) {
			int finalTest = sc.nextInt();
			if(finalTest < 40) finalTest = 40;
			sum += finalTest;
		}
		System.out.println(sum/5);
	}
}
