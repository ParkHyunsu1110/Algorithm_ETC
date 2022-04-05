package Baekjoon;

import java.util.*;

public class Q5893 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String numStr = sc.next();
		
		Long numInt = Long.getLong(numStr, 2) * 17;
	
		//numStr = Integer.(numInt);
		System.out.println(numStr);
	}
}
