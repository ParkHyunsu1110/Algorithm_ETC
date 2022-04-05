package Programmers;

import java.util.Arrays;

public class marathon {
	public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        for(int i=0; i<completion.length; i++) {
			if(participant[i].equals(completion[i])) continue;
            return answer = participant[i];
		}
        return answer = participant[completion.length];
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] participant= {"leo", "kiki", "eden"};
		String[] completion= {"eden", "kiki"};
		String answer = "";
		marathon sol = new marathon();
		System.out.println(sol.solution(participant, completion));
	}
}
