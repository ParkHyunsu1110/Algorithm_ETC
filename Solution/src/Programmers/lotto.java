package Programmers;

public class lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		int[] answer = new int[2];
		
		int zeroCount=0;
		int correct=0;
		
		for(int i=0; i<lottos.length; i++) {	//°°Àº ¼ýÀÚ °¹¼ö
			if(lottos[i] == 0) zeroCount++;	//0ÀÇ °¹¼ö
			for(int j=0; j<lottos.length; j++) {
				if(lottos[i] == win_nums[j]) correct++;
			}
		}
		switch(zeroCount + correct) {
			case 7: answer[0] = 1; break;
			case 6: answer[0] = 2; break;
			case 5: answer[0] = 3; break;
			case 4: answer[0] = 4; break;
			case 3: answer[0] = 5; break;
			case 2: answer[0] = 6; break;
			case 1: answer[0] = 6; break;
		}
		answer[1] = 7 - correct;
		System.out.println(answer);
	}
}
