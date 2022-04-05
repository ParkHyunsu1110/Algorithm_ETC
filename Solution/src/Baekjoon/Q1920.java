package Baekjoon;

import java.util.*;
public class Q1920 {
	static ArrayList<Integer> result = new ArrayList<>();
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		ArrayList<Integer> nArr = new ArrayList<>();
		for(int i=0; i<N; i++) nArr.add(sc.nextInt());	//nArr�Է�
		Collections.sort(nArr);	//nArr ����
		
		int M = sc.nextInt();
		ArrayList<Integer> mArr = new ArrayList<>();	
		for(int i=0; i<M; i++) mArr.add(sc.nextInt());	//mArr�Է�
		find(nArr, N, mArr, M);
		for(int i:result) System.out.println(i);
	}
	
	public static ArrayList<Integer> find(ArrayList nArr, int N, ArrayList mArr, int M) {
		int count;
		
		for(int i=0; i<M; i++) {
			count = 0;	//count�� �Ź� �ʱ�ȭ ����
			for(int j=0; j<N; j++) {
				if(mArr.get(i) == nArr.get(j)) {
					count++;
					break;
				}
			}
			result.add(count);
		}
		return result;
	}
}
