package CodingTest;

public class Gasolin {
	public int solution(int A, int C, int F, int K) {
        int answer = 0;
        int location=0; //���� ��ġ
        int move=0, newGasolin=C; //move == ������ �湮 Ƚ��
        for(int i=0; i<K; i++) {
        	if(F > C)
    			return -1;
        	if(location == 0) {	//���� ��ġ�� ���� ����
        		if(A+(A - F) > C) {
            		C = newGasolin - (A - F);
            		move++;
            	} else C -= A;
            	location = A;
        	} else {	
        		if(i != K-1) {	//�������� �ƴϸ� �״�� ����
        			if(A + F > C) {
                		C = newGasolin - F;
                		move++;
                	}	
        		} else { //�������̶��
        			if(A > C) { //�⸧������ �Ÿ��� ���
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
