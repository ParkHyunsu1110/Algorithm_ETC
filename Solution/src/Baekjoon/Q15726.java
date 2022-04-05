package Baekjoon;

import java.util.*;

public class Q15726 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();
		int case1 =(int) (a / b * c), case2 =(int) (a * b / c);
		int result = case1 < case2 ? case2 : case1;
		System.out.println(result);
	}
}
