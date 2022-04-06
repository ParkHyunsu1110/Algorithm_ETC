package Baekjoon;

import java.util.Scanner;

public class Q2490 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		for(int j=0; j<3; j++) {
			int sum=0;
			char result = 0;
			for(int i=0; i<4; i++) sum += sc.nextInt();
			
			switch(sum) {
				case 0: result = 'D'; break;
				case 1: result = 'C'; break;
				case 2: result = 'B'; break;
				case 3: result = 'A'; break;
				case 4: result = 'E'; break;
			}
			System.out.println(result);
		}
	}
}
