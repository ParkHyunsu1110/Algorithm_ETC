package Programmers;

import java.util.Arrays;
public class MinMax {
	public String solution(String s) {
        String answer = "";
        //split해서 Array에 담고 sort
        String[] numbers = s.split(" ");
        int[] num = new int[numbers.length];
        for(int i=0; i<numbers.length; i++)
        	num[i]= Integer.parseInt(numbers[i]);
        Arrays.sort(num);
        
        answer = num[0] + " " + num[num.length-1];
        return answer;
    }
	public static void main(String[] args) {
		String s = "-1 -2 -3 -4";
		MinMax mm = new MinMax();
		System.out.println(mm.solution(s));
	}
}
