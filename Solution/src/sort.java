import java.util.*;

/*
 * 5�� �Է��ؼ� �ִ�, �ִ� -1 ���ϱ�
 * */
public class sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> array = new ArrayList<>();	//�迭 ����
		
		for(int i=0; i<5; i++) array.add(sc.nextInt());	//�迭�� �߰� 
		
		Collections.sort(array);
		
		System.out.println(array.get(array.size()-1));
		System.out.println(array.get(array.size()-2));
		
	}
}
