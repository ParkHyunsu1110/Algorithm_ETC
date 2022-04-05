package Baekjoon;

import java.util.Scanner;

public class Q14935 {

	public static void main(String[] args) {
		System.out.println("FA");
	}
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int[] array = new int[digit(X)+1];
		
		for(int i=0; i<array.length; i++) array[i] = first(X) * digit(X); 
		if(array[digit(X) - 1] == array[digit(X)]) System.out.println("FA");
		else System.out.println("NFA");
	}
	public static int first(int X) { //맨 앞 수
		int a = 1;
		for(int i=0; i<digit(X) - 1; i++) a *= 10;
		
		return X /= a;
	}
	public static int digit(int x) {	//자릿수
		int count = 0;
		while(true) {
			if(x == 0) break;
			x /= 10;
			count++;
		}
		return count;
	}*/
}
