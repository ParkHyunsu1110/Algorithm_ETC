package Baekjoon;

import java.util.*;

public class Q5543 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> burger = new ArrayList<>();
		ArrayList<Integer> beverage = new ArrayList<>();
		for(int i=0; i<3; i++) burger.add(sc.nextInt());
		for(int i=0; i<2; i++) beverage.add(sc.nextInt());
		
		Collections.sort(burger);
		Collections.sort(beverage);
		System.out.println(burger.get(0)  + beverage.get(0) - 50);
	}
}
