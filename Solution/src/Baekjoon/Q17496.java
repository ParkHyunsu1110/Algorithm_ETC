package Baekjoon;

import java.util.Scanner;

public class Q17496 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); //�� �Ⱓ
		int T = sc.nextInt(); //�ڶ�� �Ⱓ
		int C = sc.nextInt(); //ĭ ��
		int p = sc.nextInt(); //���� ����
		
		
		if((N / T) * T + 1 > N) System.out.println(((N / T) - 1) * C * p);
		else System.out.println((N / T) * C * p);
	}
}
