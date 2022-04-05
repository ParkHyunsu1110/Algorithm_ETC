import java.util.*;

/*
 * 5개 입력해서 최대, 최대 -1 구하기
 * */
public class sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> array = new ArrayList<>();	//배열 선언
		
		for(int i=0; i<5; i++) array.add(sc.nextInt());	//배열에 추가 
		
		Collections.sort(array);
		
		System.out.println(array.get(array.size()-1));
		System.out.println(array.get(array.size()-2));
		
	}
}
