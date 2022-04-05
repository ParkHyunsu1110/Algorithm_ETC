package Baekjoon;

import java.util.Scanner;

public class Q16431 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int bX = sc.nextInt(), bY = sc.nextInt();
		int dX = sc.nextInt(), dY = sc.nextInt();
		int jX = sc.nextInt(), jY = sc.nextInt();
		
		if(Bessie(bX, bY, jX, jY) > Daisy(dX, dY, jX, jY)) System.out.println("daisy");
		else if(Bessie(bX, bY, jX, jY) < Daisy(dX, dY, jX, jY)) System.out.println("bessie");
		else System.out.println("tie");
	}
	public static int Bessie(int bX, int bY, int jX, int jY) {
		int X = bX - jX, Y = bY - jY;
		if(X < 0) X *= -1;
		if(Y < 0) Y *= -1;
		return (X > Y) ? X : Y;
	}
	
	public static int Daisy(int dX, int dY, int jX, int jY) {
		int X = dX - jX, Y = dY - jY;
		if(X < 0) X *= -1;
		if(Y < 0) Y *= -1;
		return X + Y;
	}
}
