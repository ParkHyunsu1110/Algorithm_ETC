package Baekjoon;

import java.util.*;

public class Q11948 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> scienceArray = new ArrayList<>();	//이과 과목
		ArrayList<Integer> liberalArray = new ArrayList<>();	//문과 과목
		
		for(int i=0; i<4; i++) scienceArray.add(sc.nextInt());
		for(int i=0; i<2; i++) liberalArray.add(sc.nextInt());
		Collections.sort(scienceArray);	//정렬
		Collections.sort(liberalArray);	//정렬
		
		Collections.reverse(scienceArray);	//역순 정렬
		Collections.reverse(liberalArray);	//역순 정렬
		
		int sumMax = liberalArray.get(0);	//기본 값을 문과 과목의 0번째 값으로 설정
		
		for(int i=0; i<3; i++) sumMax += scienceArray.get(i);
		
		System.out.println(sumMax);
	}
}
