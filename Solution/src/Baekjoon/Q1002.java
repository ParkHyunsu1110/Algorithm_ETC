package Baekjoon;

import java.util.*;
public class Q1002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int i=0; i<T; i++) {
			int x1=sc.nextInt(); int y1=sc.nextInt(); int r1=sc.nextInt();
			int x2=sc.nextInt(); int y2=sc.nextInt(); int r2=sc.nextInt();
			int dist = Euclid(x1, y1, x2, y2);
			if(x1 == x2 && y1 == y2 && r1 == r2) System.out.println(-1);	
			else if(dist == Math.pow(r2 - r1, 2) || dist == Math.pow(r1 + r2, 2)) System.out.println(1);
			else if(dist > Math.pow(r1 + r2, 2) || dist < Math.pow(r2 - r1, 2)) System.out.println(0);
			else System.out.println(2);
		}
	}
	public static int Euclid(int x1, int y1, int x2, int y2) {
		int dist = (int)(Math.pow(x2 - x1, 2) + Math.pow(y1 - y2, 2));
		return dist;
	}
}
