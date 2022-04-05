package Baekjoon;

import java.util.*;

public class Q13866 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> array = new ArrayList<Integer>();
		
		for(int i=0; i<4; i++) array.add(sc.nextInt());
		Collections.sort(array);
		int result=(array.get(0) + array.get(3)) - (array.get(1) + array.get(2));
		if(result < 0) result *= -1;
		System.out.println(result);
	}
}
