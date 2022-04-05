package Baekjoon;

import java.util.*;

public class Q11948 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> scienceArray = new ArrayList<>();	//�̰� ����
		ArrayList<Integer> liberalArray = new ArrayList<>();	//���� ����
		
		for(int i=0; i<4; i++) scienceArray.add(sc.nextInt());
		for(int i=0; i<2; i++) liberalArray.add(sc.nextInt());
		Collections.sort(scienceArray);	//����
		Collections.sort(liberalArray);	//����
		
		Collections.reverse(scienceArray);	//���� ����
		Collections.reverse(liberalArray);	//���� ����
		
		int sumMax = liberalArray.get(0);	//�⺻ ���� ���� ������ 0��° ������ ����
		
		for(int i=0; i<3; i++) sumMax += scienceArray.get(i);
		
		System.out.println(sumMax);
	}
}
