package CodingTest;

public class Gasolin {
	public int solution(int A, int C, int F, int K) {
        int answer = 0;
        int location=0; //현재 위치
        int move=0, newGasolin=C; //move == 주유소 방문 횟수
        for(int i=0; i<K; i++) {
        	if(F > C)
    			return -1;
        	if(location == 0) {	//현재 위치에 따른 선택
        		if(A+(A - F) > C) {
            		C = newGasolin - (A - F);
            		move++;
            	} else C -= A;
            	location = A;
        	} else {	
        		if(i != K-1) {	//마지막이 아니면 그대로 진행
        			if(A + F > C) {
                		C = newGasolin - F;
                		move++;
                	}	
        		} else { //마지막이라면
        			if(A > C) { //기름량보다 거리가 길면
        				C = newGasolin - F;
        				move++;
        			}
        			C -= A;
        			
        		}
        		location = 0;
        	}	
        }
        return move;
    }
	public static void main(String[] args) {
		Gasolin gs = new Gasolin();
		int a=6, c=9, f=2, k=6;
		System.out.println(gs.solution(a, c, f, k));
	}
}
