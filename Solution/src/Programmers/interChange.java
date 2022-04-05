package Programmers;

import java.util.Arrays;
import java.util.Collections;

public class interChange {

	public static void main(String[] args) {
		long answer = 0;
		long n = 118372;
		String s = "";
        String sn = String.valueOf(n);
        String array[] = sn.split("");
        Arrays.sort(array, Collections.reverseOrder());
        for(int i=0; i<array.length; i++){
        	s += array[i];
        }
        answer = Long.parseLong(s);
        System.out.println(answer);
    }
}
