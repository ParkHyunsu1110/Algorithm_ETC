package Baekjoon;

import java.util.Scanner;

public class Q1924 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int month = sc.nextInt(), day = sc.nextInt();
		int m = 1, d = 1;
		int days = day - d;
		String week = null;
		
		for(int i=month - 1; i>0; i--) {	//달마다 일수 더해줌
			switch(i) {
				case 1: case 3: case 5: case 7: case 8: case 10: case 12: days += 31; break;
				case 2: days += 28; break;
				case 4: case 6:  case 9: case 11: days += 30; break;
			}
		}
		
		switch(days % 7) {	//나머지에 따라 요일 결정
			case 0:	week = "MON"; break;
			case 1: week = "TUE"; break;
			case 2: week = "WED"; break;
			case 3: week = "THU"; break;
			case 4: week = "FRI"; break;
			case 5: week = "SAT"; break;
			case 6: week = "SUN"; break;
		}
		
		System.out.println(week);
	}
}
